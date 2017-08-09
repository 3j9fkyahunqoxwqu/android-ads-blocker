package fr.CHEF-KOCH.disableads.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.ClipboardManager;
import android.text.TextUtils.TruncateAt;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import fr.CHEF-KOCH.disableads.CursorAdapter;
import fr.CHEF-KOCH.disableads.adapters.Station;

public abstract class MainActivity
  extends ListFragment
  implements MenuItemCompat.OnActionExpandListener, SearchView.OnQueryTextListener, Fragment
{
  private MultiSelectionUtil.Controller mActivity;
  private CursorAdapter mAdapter;
  private MainActivity.8 mHandler;
  private SearchView mSearchView;
  private MenuItem searchItem;
  
  public MainActivity() {}
  
  protected abstract CursorAdapter browseTo();
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    int m = 0;
    int i = 0;
    int j;
    Object localObject;
    int n;
    switch (paramMenuItem.getItemId())
    {
    default: 
      return true;
    case 2131361869: 
      mHandler = new MainActivity.8(this, null);
      paramMenuItem = getListView().getCheckedItemIds();
      j = paramMenuItem.length;
      localObject = new Integer[j];
      for (;;)
      {
        if (i >= j)
        {
          mHandler.execute((Object[])localObject);
          paramActionMode.finish();
          return true;
        }
        localObject[i] = Integer.valueOf((int)paramMenuItem[i]);
        i += 1;
      }
    case 2131361867: 
      paramActionMode = getListView().getCheckedItemIds();
      j = paramActionMode.length;
      paramMenuItem = new StringBuilder();
      i = 0;
      if (i >= j)
      {
        ((ClipboardManager)getActivity().getSystemService("clipboard")).setText(paramMenuItem.toString());
        Toast.makeText(getActivity(), 2131427380, 0).show();
        return true;
      }
      localObject = (Station)mAdapter.getItem((int)paramActionMode[i]);
      if (mAdapter.getItem()) {
        paramMenuItem.append(name);
      }
      for (;;)
      {
        paramMenuItem.append(" ");
        i += 1;
        break;
        paramMenuItem.append(name.substring(name.lastIndexOf(".") + 1));
      }
    case 2131361866: 
      paramMenuItem = getListView();
      n = paramMenuItem.getCount();
      localObject = paramMenuItem.getCheckedItemPositions();
      if (localObject != null)
      {
        j = 0;
        i = 0;
        if (j < ((SparseBooleanArray)localObject).size()) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      j = m;
      if (i == n)
      {
        i = 0;
        label318:
        if (i < n) {}
      }
      for (;;)
      {
        mAdapter.notifyDataSetChanged();
        return true;
        if (((SparseBooleanArray)localObject).valueAt(j)) {}
        for (int k = 1;; k = 0)
        {
          i += k;
          j += 1;
          break;
        }
        paramMenuItem.setItemChecked(i, false);
        paramActionMode.finish();
        i += 1;
        break label318;
        do
        {
          paramMenuItem.setItemChecked(j, true);
          j += 1;
        } while (j < n);
      }
      mAdapter.swapCursor();
      return true;
      i = 0;
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    setHasOptionsMenu(true);
    mAdapter = browseTo();
    mActivity = FragmentTransaction.attach(getListView(), (ActionBarActivity)getActivity(), this);
    mActivity.tryRestoreInstanceState(paramBundle);
    int j = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
    int i = j;
    if (j == 0) {
      i = 2131361826;
    }
    paramBundle = (TextView)getActivity().findViewById(i);
    if (paramBundle != null)
    {
      paramBundle.setEllipsize(TextUtils.TruncateAt.MARQUEE);
      paramBundle.setMarqueeRepeatLimit(-1);
      paramBundle.setFocusable(true);
      paramBundle.setFocusableInTouchMode(true);
      paramBundle.requestFocus();
      paramBundle.setTextColor(getResources().getColor(17170443));
    }
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    paramActionMode.getMenuInflater().inflate(2131623936, paramMenu);
    return true;
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131623937, paramMenu);
    searchItem = paramMenu.findItem(2131361870);
    mSearchView = ((SearchView)MenuItemCompat.getActionView(searchItem));
    mSearchView.setQueryHint(getString(2131427391));
    mSearchView.setOnQueryTextListener(this);
    MenuItemCompat.setOnActionExpandListener(searchItem, this);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode) {}
  
  public void onDestroyView()
  {
    super.onDestroyView();
    if (MenuItemCompat.isActionViewExpanded(searchItem)) {
      MenuItemCompat.collapseActionView(searchItem);
    }
    mActivity.finish();
    if (mHandler != null) {
      mHandler.cancel(true);
    }
  }
  
  public void onItemCheckedStateChanged(ActionMode paramActionMode, int paramInt, long paramLong, boolean paramBoolean)
  {
    mAdapter.notifyDataSetChanged();
  }
  
  public void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    super.onListItemClick(paramListView, paramView, paramInt, paramLong);
    mHandler = new MainActivity.8(this, null);
    mHandler.execute(new Integer[] { Integer.valueOf(paramInt) });
  }
  
  protected abstract void onListItemClick(Integer... paramVarArgs);
  
  public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    mSearchView.setQuery(null, false);
    return true;
  }
  
  public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      break;
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      getActivity().finish();
      continue;
      mAdapter.swapCursor();
    }
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return true;
  }
  
  public boolean onQueryTextChange(String paramString)
  {
    if (mAdapter != null) {
      mAdapter.getFilter().filter(paramString);
    }
    return true;
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    return true;
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    mActivity.saveInstanceState(paramBundle);
  }
}

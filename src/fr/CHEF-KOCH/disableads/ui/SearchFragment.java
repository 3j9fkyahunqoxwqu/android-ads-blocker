package fr.CHEF-KOCH.disableads.ui;

import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import cn.wq.disableads.AboutActivity;
import cn.wq.disableads.ServiceListActivity;
import fr.CHEF-KOCH.disableads.adapters.AppInfo;
import java.util.List;

public class SearchFragment
  extends ListFragment
  implements LoaderManager.LoaderCallbacks, MenuItemCompat.OnActionExpandListener, SearchView.OnQueryTextListener
{
  private TimeZoneFilterTypeAdapter mAdapter;
  private boolean mJustFolders;
  private int position = -1;
  private MenuItem searchItem;
  private SearchView searchView;
  
  public SearchFragment() {}
  
  public static SearchFragment newInstance(boolean paramBoolean)
  {
    SearchFragment localSearchFragment = new SearchFragment();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("isSystem", paramBoolean);
    localSearchFragment.setArguments(localBundle);
    return localSearchFragment;
  }
  
  private void onItemClick()
  {
    if (position >= 0)
    {
      mAdapter.add(position);
      mAdapter.notifyDataSetChanged();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    mJustFolders = getArguments().getBoolean("isSystem");
    mAdapter = new TimeZoneFilterTypeAdapter(this, getActivity());
    setListAdapter(mAdapter);
    setListShown(false);
    getLoaderManager().initLoader(0, null, this);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 0) {
      onItemClick();
    }
  }
  
  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new FileLoader(getActivity(), mJustFolders);
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131623938, paramMenu);
    searchItem = paramMenu.findItem(2131361872);
    searchView = ((SearchView)MenuItemCompat.getActionView(searchItem));
    searchView.setQueryHint(getString(2131427391));
    searchView.setOnQueryTextListener(this);
    MenuItemCompat.setOnActionExpandListener(searchItem, this);
  }
  
  public void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    super.onListItemClick(paramListView, paramView, paramInt, paramLong);
    paramListView = (AppInfo)mAdapter.getItem(paramInt);
    try
    {
      paramView = getActivity().getPackageManager();
      String str = name;
      paramView.getPackageInfo(str, 0);
      paramView = new Bundle();
      paramView.putString("packageName", name);
      paramView.putString("title", id);
      position = paramInt;
      MenuItemCompat.collapseActionView(searchItem);
      paramListView = new Intent(getActivity(), ServiceListActivity.class);
      paramListView.putExtras(paramView);
      startActivityForResult(paramListView, 0);
      return;
    }
    catch (PackageManager.NameNotFoundException paramListView)
    {
      paramListView.printStackTrace();
      Toast.makeText(getActivity(), 2131427376, 0).show();
    }
  }
  
  public void onLoadFinished(Loader paramLoader, List paramList)
  {
    mAdapter.setData(paramList);
    if (isResumed()) {
      setListShown(true);
    }
    for (;;)
    {
      setHasOptionsMenu(true);
      return;
      setListShownNoAnimation(true);
    }
  }
  
  public void onLoaderReset(Loader paramLoader)
  {
    mAdapter.setData(null);
  }
  
  public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    searchView.setQuery(null, false);
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
      new AboutDialog(null).show(getChildFragmentManager(), "sort");
      continue;
      startActivity(new Intent(getActivity(), AboutActivity.class));
      continue;
      getActivity().sendBroadcast(new Intent("action_sort_change"));
    }
  }
  
  public boolean onQueryTextChange(String paramString)
  {
    ListAdapter localListAdapter = getListAdapter();
    if ((localListAdapter != null) && (MenuItemCompat.isActionViewExpanded(searchItem))) {
      ((Filterable)localListAdapter).getFilter().filter(paramString);
    }
    return true;
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    return true;
  }
}

package fr.CHEF-KOCH.disableads.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListFragment
  extends Fragment
{
  ListAdapter mAdapter;
  CharSequence mEmptyText;
  View mEmptyView;
  private final Handler mHandler = new Handler();
  ListView mList;
  View mListContainer;
  boolean mListShown;
  private final AdapterView.OnItemClickListener mOnClickListener = new ActivityDlgActionInput.DlgAttributes.1(this);
  View mProgressContainer;
  private final Runnable mRequestFocus = new MonthByWeekFragment.2(this);
  TextView mStandardEmptyView;
  
  public ListFragment() {}
  
  private void ensureList()
  {
    if (mList != null) {
      return;
    }
    Object localObject = getView();
    if (localObject == null) {
      throw new IllegalStateException("Content view not yet created");
    }
    if ((localObject instanceof ListView))
    {
      mList = ((ListView)localObject);
      mListShown = true;
      mList.setOnItemClickListener(mOnClickListener);
      if (mAdapter == null) {
        break label254;
      }
      localObject = mAdapter;
      mAdapter = null;
      setListAdapter((ListAdapter)localObject);
    }
    for (;;)
    {
      mHandler.post(mRequestFocus);
      return;
      mStandardEmptyView = ((TextView)((View)localObject).findViewById(2131361859));
      if (mStandardEmptyView == null) {
        mEmptyView = ((View)localObject).findViewById(16908292);
      }
      for (;;)
      {
        mProgressContainer = ((View)localObject).findViewById(2131361856);
        mListContainer = ((View)localObject).findViewById(2131361857);
        localObject = ((View)localObject).findViewById(2131361858);
        if ((localObject instanceof ListView)) {
          break label193;
        }
        if (localObject != null) {
          break;
        }
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'R.id.list'");
        mStandardEmptyView.setVisibility(8);
      }
      throw new RuntimeException("Content has view with id attribute 'R.id.list' that is not a ListView class");
      label193:
      mList = ((ListView)localObject);
      if (mEmptyView != null)
      {
        mList.setEmptyView(mEmptyView);
        break;
      }
      if (mEmptyText == null) {
        break;
      }
      mStandardEmptyView.setText(mEmptyText);
      mList.setEmptyView(mStandardEmptyView);
      break;
      label254:
      if (mProgressContainer != null) {
        setListShown(false, false);
      }
    }
  }
  
  private void setListShown(boolean paramBoolean1, boolean paramBoolean2)
  {
    ensureList();
    if (mProgressContainer == null) {
      throw new IllegalStateException("Can't be used with a custom content view");
    }
    if (mListShown == paramBoolean1) {
      return;
    }
    mListShown = paramBoolean1;
    if (paramBoolean1)
    {
      if (paramBoolean2)
      {
        mProgressContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432577));
        mListContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432576));
      }
      for (;;)
      {
        mProgressContainer.setVisibility(8);
        mListContainer.setVisibility(0);
        return;
        mProgressContainer.clearAnimation();
        mListContainer.clearAnimation();
      }
    }
    if (paramBoolean2)
    {
      mProgressContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432576));
      mListContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432577));
    }
    for (;;)
    {
      mProgressContainer.setVisibility(0);
      mListContainer.setVisibility(8);
      return;
      mProgressContainer.clearAnimation();
      mListContainer.clearAnimation();
    }
  }
  
  public ListAdapter getListAdapter()
  {
    return mAdapter;
  }
  
  public ListView getListView()
  {
    ensureList();
    return mList;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130903065, paramViewGroup, false);
  }
  
  public void onDestroyView()
  {
    mHandler.removeCallbacks(mRequestFocus);
    mList = null;
    mListShown = false;
    mListContainer = null;
    mProgressContainer = null;
    mEmptyView = null;
    mStandardEmptyView = null;
    super.onDestroyView();
  }
  
  public void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong) {}
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    ensureList();
  }
  
  public void setListAdapter(ListAdapter paramListAdapter)
  {
    boolean bool = false;
    if (mAdapter != null) {}
    for (int i = 1;; i = 0)
    {
      mAdapter = paramListAdapter;
      if (mList == null) {
        break;
      }
      mList.setAdapter(paramListAdapter);
      if ((mListShown) || (i != 0)) {
        break;
      }
      if (getView().getWindowToken() != null) {
        bool = true;
      }
      setListShown(true, bool);
      return;
    }
  }
  
  public void setListShown(boolean paramBoolean)
  {
    setListShown(paramBoolean, true);
  }
  
  public void setListShownNoAnimation(boolean paramBoolean)
  {
    setListShown(paramBoolean, false);
  }
}

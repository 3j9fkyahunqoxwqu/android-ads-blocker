package fr.CHEF-KOCH.disableads.ui;

import android.content.Context;
import android.support.v4.content.Loader;
import android.support.v4.content.f;
import fr.CHEF-KOCH.disableads.Preferences;
import java.util.List;

class FileLoader
  extends f
{
  private boolean data;
  private List mApps;
  private AccountLoader.1 mPackageObserver;
  
  public FileLoader(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    data = paramBoolean;
  }
  
  public void deliverResult(List paramList)
  {
    if ((isReset()) && (paramList != null)) {
      onReleaseResources(paramList);
    }
    mApps = paramList;
    if (isStarted()) {
      super.deliverResult(paramList);
    }
    if (paramList != null) {
      onReleaseResources(paramList);
    }
  }
  
  public List doInBackground()
  {
    return Preferences.doInBackground(getContext(), data);
  }
  
  public void onCanceled(List paramList)
  {
    super.onCanceled(paramList);
    onReleaseResources(paramList);
  }
  
  protected void onReleaseResources(List paramList) {}
  
  protected void onReset()
  {
    super.onReset();
    onStopLoading();
    if (mApps != null)
    {
      onReleaseResources(mApps);
      mApps = null;
    }
    if (mPackageObserver != null)
    {
      getContext().unregisterReceiver(mPackageObserver);
      mPackageObserver = null;
    }
  }
  
  protected void onStartLoading()
  {
    if (mApps != null) {
      deliverResult(mApps);
    }
    if (mPackageObserver == null) {
      mPackageObserver = new AccountLoader.1(this);
    }
    if ((mApps == null) || (takeContentChanged())) {
      forceLoad();
    }
  }
  
  protected void onStopLoading()
  {
    d();
  }
}

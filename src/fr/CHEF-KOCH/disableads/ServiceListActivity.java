package fr.tvbarthel.disableservice;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import fr.tvbarthel.disableservice.ui.FileManagerActivity;

public class ServiceListActivity
  extends ActionBarActivity
{
  public ServiceListActivity() {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    ActionBar localActionBar = getSupportActionBar();
    localActionBar.setTitle(localBundle.getString("title"));
    localActionBar.setDisplayHomeAsUpEnabled(true);
    try
    {
      localActionBar.setIcon(getPackageManager().getApplicationIcon(localBundle.getString("packageName")));
      if (paramBundle == null)
      {
        paramBundle = getSupportFragmentManager().beginTransaction();
        paramBundle.add(16908290, FileManagerActivity.newInstance(localBundle));
        paramBundle.commit();
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        localNameNotFoundException.printStackTrace();
      }
    }
  }
}

package fr.CHEF-KOCH.disableads;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import fr.CHEF-KOCH.disableads.ui.Preferences;

public class AboutActivity
  extends ActionBarActivity
{
  public AboutActivity() {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ActionBar localActionBar = getSupportActionBar();
    localActionBar.setDisplayHomeAsUpEnabled(true);
    localActionBar.setTitle(2131427369);
    if (paramBundle == null) {
      getSupportFragmentManager().beginTransaction().add(16908290, new Preferences()).commit();
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    finish();
    return true;
  }
}

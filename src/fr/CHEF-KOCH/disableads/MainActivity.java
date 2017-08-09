package fr.tvbarthel.disableservice;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class MainActivity
  extends ActionBarActivity
{
  private MyPagerTabStip mTabs;
  private ViewPager mViewPager;
  
  public MainActivity() {}
  
  private boolean enable()
  {
    return Settings.Secure.getInt(getContentResolver(), "adb_enabled", 0) > 0;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903066);
    mViewPager = ((ViewPager)findViewById(2131361861));
    mViewPager.setAdapter(new Wallpaper.SectionsPagerAdapter(this, this));
    mTabs = ((MyPagerTabStip)findViewById(2131361860));
    mTabs.setViewPager(mViewPager);
    if ((Build.VERSION.SDK_INT < 11) && (!enable())) {
      Toast.makeText(this, 2131427359, 0).show();
    }
  }
}

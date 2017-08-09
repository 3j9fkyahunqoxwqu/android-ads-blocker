package fr.CHEF-KOCH.disableads.ui;

import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

public class FragmentTransaction
{
  public FragmentTransaction() {}
  
  public static MultiSelectionUtil.Controller attach(ListView paramListView, ActionBarActivity paramActionBarActivity, Fragment paramFragment)
  {
    return MultiSelectionUtil.Controller.attach(paramListView, paramActionBarActivity, paramFragment);
  }
}

package fr.CHEF-KOCH.disableads.ui;

import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;

public abstract interface Fragment
  extends ActionMode.Callback
{
  public abstract void onItemCheckedStateChanged(ActionMode paramActionMode, int paramInt, long paramLong, boolean paramBoolean);
}

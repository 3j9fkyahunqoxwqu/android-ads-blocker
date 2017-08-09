package fr.CHEF-KOCH.disableads.ui;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

class AboutDialog
  extends DialogFragment
{
  private AboutDialog() {}
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    paramBundle = PreferenceManager.getDefaultSharedPreferences(getActivity());
    return new AlertDialog.Builder(getActivity()).setTitle(2131427378).setSingleChoiceItems(2131558401, paramBundle.getInt("sort", 0), new SettingsActivity.1(this, paramBundle)).setNegativeButton(2131427350, new FileBrowser.11(this)).create();
  }
}

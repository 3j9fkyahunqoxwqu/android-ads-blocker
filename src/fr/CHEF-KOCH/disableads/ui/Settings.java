package fr.CHEF-KOCH.disableads.ui;

import android.os.AsyncTask;
import android.os.Environment;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.support.v4.app.Fragment;
import android.widget.Toast;

class Settings
  implements Preference.OnPreferenceClickListener
{
  Settings(Preferences paramPreferences) {}
  
  public boolean onPreferenceClick(Preference paramPreference)
  {
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      Toast.makeText(this$0.getActivity(), "Media not mounted!", 1).show();
      return true;
    }
    new LoadingDialog(this).execute(new Void[0]);
    return true;
  }
}

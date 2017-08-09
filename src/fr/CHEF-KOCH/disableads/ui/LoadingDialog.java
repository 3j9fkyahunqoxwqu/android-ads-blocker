package fr.CHEF-KOCH.disableads.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.widget.Toast;

class LoadingDialog
  extends AsyncTask
{
  private ProgressDialog pd;
  
  LoadingDialog(Settings paramSettings) {}
  
  protected Boolean doInBackground(Void... paramVarArgs)
  {
    return Boolean.valueOf(Preferences.call(Settings.get(context)));
  }
  
  protected void onPostExecute(Boolean paramBoolean)
  {
    super.onPostExecute(paramBoolean);
    if (paramBoolean.booleanValue())
    {
      paramBoolean = Toast.makeText(Settings.get(context).getActivity(), Settings.get(context).getString(2131427368), 1);
      Settings.get(context).getActivity().sendBroadcast(new Intent("action_sort_change"));
    }
    for (;;)
    {
      paramBoolean.setGravity(17, 0, 0);
      paramBoolean.show();
      pd.dismiss();
      return;
      paramBoolean = Toast.makeText(Settings.get(context).getActivity(), Settings.get(context).getString(2131427357), 0);
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    pd = new ProgressDialog(Settings.get(context).getActivity());
    pd.setMessage(Settings.get(context).getString(2131427352));
    pd.setCancelable(false);
    pd.show();
  }
}

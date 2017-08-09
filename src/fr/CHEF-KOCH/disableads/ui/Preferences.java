package fr.CHEF-KOCH.disableads.ui;

import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Environment;
import android.preference.Preference;
import android.support.v4.app.Fragment;
import android.support.v4.preference.PreferenceFragment;
import android.widget.Toast;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

public class Preferences
  extends PreferenceFragment
{
  public Preferences() {}
  
  private void doInBackground()
  {
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      Toast.makeText(getActivity(), "Media not mounted!", 1).show();
      return;
    }
    Object localObject2 = getActivity().getPackageManager();
    Object localObject3 = ((PackageManager)localObject2).getInstalledApplications(0);
    Object localObject1 = new StringBuilder("");
    localObject3 = ((List)localObject3).iterator();
    for (;;)
    {
      if (!((Iterator)localObject3).hasNext())
      {
        localObject2 = new File(fr.CHEF-KOCH.disableads.Preferences.TAG);
        try
        {
          localObject2 = new FileWriter((File)localObject2);
          ((FileWriter)localObject2).write(((StringBuilder)localObject1).toString());
          ((FileWriter)localObject2).flush();
          ((FileWriter)localObject2).close();
          localObject1 = Toast.makeText(getActivity(), getString(2131427368), 1);
          ((Toast)localObject1).setGravity(17, 0, 0);
          ((Toast)localObject1).show();
          return;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
          return;
        }
      }
      ServiceInfo[] arrayOfServiceInfo = fr.CHEF-KOCH.disableads.Preferences.getName(nextpackageName, (PackageManager)localObject2);
      if (arrayOfServiceInfo != null)
      {
        int j = arrayOfServiceInfo.length;
        int i = 0;
        while (i < j)
        {
          ServiceInfo localServiceInfo = arrayOfServiceInfo[i];
          if (((PackageManager)localObject2).getComponentEnabledSetting(new ComponentName(packageName, name)) > 1)
          {
            localIOException.append(packageName);
            localIOException.append("/");
            localIOException.append(Matcher.quoteReplacement(name));
            localIOException.append("\n");
          }
          i += 1;
        }
      }
    }
  }
  
  /* Error */
  private boolean exec()
  {
    // Byte code:
    //   0: new 85	java/io/File
    //   3: dup
    //   4: getstatic 91	fr/CHEF-KOCH/disableads/Preferences:TAG	Ljava/lang/String;
    //   7: invokespecial 92	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: astore_2
    //   11: new 166	java/io/FileReader
    //   14: dup
    //   15: aload_2
    //   16: invokespecial 167	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   19: astore_2
    //   20: new 169	java/io/BufferedReader
    //   23: dup
    //   24: aload_2
    //   25: invokespecial 172	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   28: astore_2
    //   29: new 67	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   36: astore_3
    //   37: aload_3
    //   38: ldc -94
    //   40: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_2
    //   45: invokevirtual 176	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   48: astore 4
    //   50: aload 4
    //   52: ifnonnull +21 -> 73
    //   55: aload_2
    //   56: invokevirtual 177	java/io/BufferedReader:close	()V
    //   59: aload_3
    //   60: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: aload_0
    //   64: invokevirtual 42	android/support/v4/app/Fragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   67: invokestatic 180	fr/CHEF-KOCH/disableads/Preferences:call	(Ljava/lang/String;Landroid/content/Context;)Z
    //   70: istore_1
    //   71: iload_1
    //   72: ireturn
    //   73: aload_3
    //   74: ldc -74
    //   76: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: aload_3
    //   81: aload 4
    //   83: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_3
    //   88: ldc -94
    //   90: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: goto -50 -> 44
    //   97: astore_2
    //   98: aload_2
    //   99: invokevirtual 183	java/io/FileNotFoundException:printStackTrace	()V
    //   102: iconst_0
    //   103: ireturn
    //   104: astore_2
    //   105: aload_2
    //   106: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   109: goto -7 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	Preferences
    //   70	2	1	bool	boolean
    //   10	46	2	localObject	Object
    //   97	2	2	localFileNotFoundException	java.io.FileNotFoundException
    //   104	2	2	localIOException	IOException
    //   36	52	3	localStringBuilder	StringBuilder
    //   48	34	4	str	String
    // Exception table:
    //   from	to	target	type
    //   11	20	97	java/io/FileNotFoundException
    //   20	29	97	java/io/FileNotFoundException
    //   29	44	97	java/io/FileNotFoundException
    //   44	50	97	java/io/FileNotFoundException
    //   55	71	97	java/io/FileNotFoundException
    //   73	94	97	java/io/FileNotFoundException
    //   11	20	104	java/io/IOException
    //   20	29	104	java/io/IOException
    //   29	44	104	java/io/IOException
    //   44	50	104	java/io/IOException
    //   55	71	104	java/io/IOException
    //   73	94	104	java/io/IOException
  }
  
  private boolean getBoolean()
  {
    return new File(fr.CHEF-KOCH.disableads.Preferences.TAG).exists();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2131034112);
    Preference localPreference = findPreference("version");
    paramBundle = getActivity().getPackageManager();
    try
    {
      localObject = paramBundle.getPackageInfo(getActivity().getPackageName(), 0);
      localObject = versionName;
      localPreference.setSummary((CharSequence)localObject);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject;
        localNameNotFoundException.printStackTrace();
        continue;
        paramBundle.setEnabled(false);
      }
    }
    localPreference = findPreference("author");
    localObject = new Intent("android.intent.action.SEND");
    ((Intent)localObject).putExtra("android.intent.extra.EMAIL", new String[] { "wangqi060934@gmail.com" });
    ((Intent)localObject).setType("message/rfc822");
    localPreference.setIntent(Intent.createChooser((Intent)localObject, getString(2131427384)));
    findPreference("rate").setOnPreferenceClickListener(new SettingsActivity.9(this, paramBundle));
    findPreference("recommend1").setOnPreferenceClickListener(new ActivitySettings.3(this, paramBundle));
    findPreference("recommend2").setOnPreferenceClickListener(new BaseActivity.5(this, paramBundle));
    paramBundle = findPreference("restore");
    if (getBoolean())
    {
      paramBundle.setSummary(fr.CHEF-KOCH.disableads.Preferences.TAG);
      paramBundle.setOnPreferenceClickListener(new Settings(this));
      findPreference("backup").setOnPreferenceClickListener(new SettingsActivity.7(this, paramBundle));
      return;
    }
  }
}

package fr.tvbarthel.disableservice;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.astuetz.a.Shell.SU;
import fr.tvbarthel.disableservice.adapters.AppInfo;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Preferences
{
  public static final String TAG = Environment.getExternalStorageDirectory() + "/DS_backup.txt";
  
  public static boolean call(String paramString, Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    switch (localSharedPreferences.getInt("type", 0))
    {
    default: 
      return exec(paramString);
    case 0: 
      if (Shell.SU.read(paramString) == null)
      {
        localSharedPreferences.edit().putInt("type", 1).commit();
        return call(paramString, paramContext);
      }
      break;
    case 1: 
      if (Shell.SU.run(paramString) == null)
      {
        localSharedPreferences.edit().putInt("type", 2).commit();
        return call(paramString, paramContext);
      }
      break;
    }
    return true;
  }
  
  public static List doInBackground(Context paramContext, boolean paramBoolean)
  {
    List localList1 = getInstance(paramContext);
    PackageManager localPackageManager = paramContext.getPackageManager();
    List localList2 = localPackageManager.getInstalledApplications(0);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList2.iterator();
    ApplicationInfo localApplicationInfo;
    do
    {
      if (!localIterator.hasNext())
      {
        localList2.clear();
        Collections.sort(localArrayList, new BarRenderer.BarComparator(PreferenceManager.getDefaultSharedPreferences(paramContext).getInt("sort", 0), Collator.getInstance(getResourcesgetConfigurationlocale)));
        return localArrayList;
      }
      localApplicationInfo = (ApplicationInfo)localIterator.next();
      if (!paramBoolean) {
        break;
      }
    } while ((flags & 0x1) == 0);
    for (;;)
    {
      ServiceInfo[] arrayOfServiceInfo = getName(packageName, localPackageManager);
      if (arrayOfServiceInfo == null) {
        break;
      }
      AppInfo localAppInfo = new AppInfo();
      code = arrayOfServiceInfo.length;
      id = getValue(localApplicationInfo.loadLabel(localPackageManager).toString());
      x = get(arrayOfServiceInfo, localPackageManager);
      c = remove(packageName, localList1);
      name = packageName;
      localArrayList.add(localAppInfo);
      break;
      if ((flags & 0x1) != 0) {
        break;
      }
    }
  }
  
  /* Error */
  public static boolean exec(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 10	java/lang/StringBuilder
    //   5: dup
    //   6: ldc -42
    //   8: invokespecial 217	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokevirtual 28	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: invokevirtual 32	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   18: astore 4
    //   20: invokestatic 223	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   23: ldc -31
    //   25: invokevirtual 228	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   28: astore_1
    //   29: aload_1
    //   30: astore_2
    //   31: new 230	java/io/DataOutputStream
    //   34: dup
    //   35: aload_1
    //   36: invokevirtual 236	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   39: invokespecial 239	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   42: astore_0
    //   43: aload_0
    //   44: aload 4
    //   46: invokevirtual 245	java/lang/String:getBytes	()[B
    //   49: invokevirtual 249	java/io/DataOutputStream:write	([B)V
    //   52: aload_0
    //   53: ldc -5
    //   55: invokevirtual 254	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: invokevirtual 257	java/io/DataOutputStream:flush	()V
    //   62: aload_1
    //   63: invokevirtual 261	java/lang/Process:waitFor	()I
    //   66: pop
    //   67: aload_0
    //   68: ifnull +7 -> 75
    //   71: aload_0
    //   72: invokevirtual 264	java/io/DataOutputStream:close	()V
    //   75: aload_1
    //   76: ifnull +7 -> 83
    //   79: aload_1
    //   80: invokevirtual 267	java/lang/Process:destroy	()V
    //   83: iconst_1
    //   84: ireturn
    //   85: astore_2
    //   86: aconst_null
    //   87: astore_0
    //   88: aload_3
    //   89: astore_1
    //   90: aload_2
    //   91: invokevirtual 270	java/lang/Exception:printStackTrace	()V
    //   94: aload_0
    //   95: ifnull +7 -> 102
    //   98: aload_0
    //   99: invokevirtual 264	java/io/DataOutputStream:close	()V
    //   102: aload_1
    //   103: ifnull +7 -> 110
    //   106: aload_1
    //   107: invokevirtual 267	java/lang/Process:destroy	()V
    //   110: iconst_0
    //   111: ireturn
    //   112: astore_1
    //   113: aconst_null
    //   114: astore_0
    //   115: aconst_null
    //   116: astore_2
    //   117: aload_0
    //   118: ifnull +7 -> 125
    //   121: aload_0
    //   122: invokevirtual 264	java/io/DataOutputStream:close	()V
    //   125: aload_2
    //   126: ifnull +7 -> 133
    //   129: aload_2
    //   130: invokevirtual 267	java/lang/Process:destroy	()V
    //   133: aload_1
    //   134: athrow
    //   135: astore_0
    //   136: goto -53 -> 83
    //   139: astore_0
    //   140: goto -7 -> 133
    //   143: astore_1
    //   144: aconst_null
    //   145: astore_0
    //   146: goto -29 -> 117
    //   149: astore_1
    //   150: goto -33 -> 117
    //   153: astore_3
    //   154: aload_1
    //   155: astore_2
    //   156: aload_3
    //   157: astore_1
    //   158: goto -41 -> 117
    //   161: astore_0
    //   162: goto -52 -> 110
    //   165: astore_2
    //   166: aconst_null
    //   167: astore_0
    //   168: goto -78 -> 90
    //   171: astore_2
    //   172: goto -82 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	paramString	String
    //   28	79	1	localObject1	Object
    //   112	22	1	localThrowable1	Throwable
    //   143	1	1	localThrowable2	Throwable
    //   149	6	1	localThrowable3	Throwable
    //   157	1	1	localThrowable4	Throwable
    //   30	1	2	localObject2	Object
    //   85	6	2	localException1	Exception
    //   116	40	2	localThrowable5	Throwable
    //   165	1	2	localException2	Exception
    //   171	1	2	localException3	Exception
    //   1	88	3	localObject3	Object
    //   153	4	3	localThrowable6	Throwable
    //   18	27	4	str	String
    // Exception table:
    //   from	to	target	type
    //   20	29	85	java/lang/Exception
    //   20	29	112	java/lang/Throwable
    //   71	75	135	java/lang/Exception
    //   79	83	135	java/lang/Exception
    //   121	125	139	java/lang/Exception
    //   129	133	139	java/lang/Exception
    //   31	43	143	java/lang/Throwable
    //   43	67	149	java/lang/Throwable
    //   90	94	153	java/lang/Throwable
    //   98	102	161	java/lang/Exception
    //   106	110	161	java/lang/Exception
    //   31	43	165	java/lang/Exception
    //   43	67	171	java/lang/Exception
  }
  
  public static int get(String paramString, PackageManager paramPackageManager)
  {
    return get(getName(paramString, paramPackageManager), paramPackageManager);
  }
  
  public static int get(ComponentInfo[] paramArrayOfComponentInfo, PackageManager paramPackageManager)
  {
    int j = 0;
    int m = paramArrayOfComponentInfo.length;
    int i = 0;
    for (;;)
    {
      if (i >= m) {
        return j;
      }
      int k = j;
      if (!get(paramArrayOfComponentInfo[i], paramPackageManager)) {
        k = j + 1;
      }
      i += 1;
      j = k;
    }
  }
  
  public static boolean get(ComponentInfo paramComponentInfo, PackageManager paramPackageManager)
  {
    return paramPackageManager.getComponentEnabledSetting(new ComponentName(packageName, name)) <= 1;
  }
  
  public static boolean get(String paramString1, String paramString2, List paramList)
  {
    paramList = paramList.iterator();
    ActivityManager.RunningServiceInfo localRunningServiceInfo;
    do
    {
      if (!paramList.hasNext()) {
        return false;
      }
      localRunningServiceInfo = (ActivityManager.RunningServiceInfo)paramList.next();
    } while ((!service.getPackageName().equals(paramString1)) || (!service.getClassName().equals(paramString2)));
    return true;
  }
  
  public static List getInstance(Context paramContext)
  {
    return ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(60);
  }
  
  public static ServiceInfo[] getName(String paramString, PackageManager paramPackageManager)
  {
    try
    {
      paramString = paramPackageManager.getPackageInfo(paramString, 516);
      return services;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String getValue(String paramString)
  {
    return paramString.replaceAll(String.valueOf('?'), "");
  }
  
  public static int remove(String paramString, List paramList)
  {
    paramList = paramList.iterator();
    int i = 0;
    for (;;)
    {
      if (!paramList.hasNext()) {
        return i;
      }
      if (nextservice.getPackageName().equals(paramString)) {
        i += 1;
      }
    }
  }
}

package com.CHEF-KOCH.a;

import android.os.Looper;
import android.util.Log;

public class Debug
{
  private static boolean debug = true;
  private static Debug.OnLogListener logListener = null;
  private static int logTypes = 65535;
  private static boolean sanityChecks = true;
  
  public static boolean getDebug()
  {
    return debug;
  }
  
  public static boolean getSanityChecksEnabled()
  {
    return sanityChecks;
  }
  
  public static boolean getSanityChecksEnabledEffective()
  {
    return (getDebug()) && (getSanityChecksEnabled());
  }
  
  public static void log(String paramString)
  {
    logCommon(1, "G", paramString);
  }
  
  public static void logCommand(String paramString)
  {
    logCommon(2, "C", paramString);
  }
  
  private static void logCommon(int paramInt, String paramString1, String paramString2)
  {
    if ((debug) && ((logTypes & paramInt) == paramInt))
    {
      if (logListener != null)
      {
        logListener.onLog(paramInt, paramString1, paramString2);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("[libsuperuser][").append(paramString1).append("]");
      if ((!paramString2.startsWith("[")) && (!paramString2.startsWith(" "))) {}
      for (paramString1 = " ";; paramString1 = "")
      {
        Log.d("libsuperuser", paramString1 + paramString2);
        return;
      }
    }
  }
  
  public static void logOutput(String paramString)
  {
    logCommon(4, "O", paramString);
  }
  
  public static boolean onMainThread()
  {
    return (Looper.myLooper() != null) && (Looper.myLooper() == Looper.getMainLooper());
  }
}

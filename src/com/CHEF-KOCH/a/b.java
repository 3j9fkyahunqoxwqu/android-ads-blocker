package com.CHEF-KOCH.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class b
  extends Thread
{
  private k a = null;
  private BufferedReader b = null;
  private String c = null;
  private List l = null;
  
  public b(String paramString, InputStream paramInputStream, List paramList)
  {
    c = paramString;
    b = new BufferedReader(new InputStreamReader(paramInputStream));
    l = paramList;
  }
  
  public void run()
  {
    for (;;)
    {
      Object localObject1 = b;
      try
      {
        localObject1 = ((BufferedReader)localObject1).readLine();
        if (localObject1 != null) {
          break label24;
        }
      }
      catch (IOException localIOException1)
      {
        Object localObject2;
        for (;;) {}
      }
      localObject1 = b;
      label24:
      try
      {
        ((BufferedReader)localObject1).close();
        return;
      }
      catch (IOException localIOException2) {}
      localObject2 = c;
      Debug.logOutput(String.format("[%s] %s", new Object[] { localObject2, localObject1 }));
      if (l != null)
      {
        localObject2 = l;
        ((List)localObject2).add(localObject1);
      }
      if (a != null)
      {
        localObject2 = a;
        ((k)localObject2).a((String)localObject1);
      }
    }
  }
}

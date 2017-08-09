package fr.CHEF-KOCH.disableads.ui;

import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.List;

class CursorFilter
  extends Filter
{
  private CursorFilter(TimeZoneFilterTypeAdapter paramTimeZoneFilterTypeAdapter) {}
  
  /* Error */
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    // Byte code:
    //   0: new 23	android/widget/Filter$FilterResults
    //   3: dup
    //   4: invokespecial 24	android/widget/Filter$FilterResults:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   12: invokestatic 30	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:getFilter	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;)Ljava/util/List;
    //   15: ifnonnull +36 -> 51
    //   18: aload_0
    //   19: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   22: invokestatic 34	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:access$getMTimeZoneData	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;)Ljava/lang/Object;
    //   25: astore_3
    //   26: aload_3
    //   27: monitorenter
    //   28: aload_0
    //   29: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   32: new 36	java/util/ArrayList
    //   35: dup
    //   36: aload_0
    //   37: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   40: invokestatic 39	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:getCount	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;)Ljava/util/List;
    //   43: invokespecial 42	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   46: invokestatic 45	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:getFilter	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;Ljava/util/List;)V
    //   49: aload_3
    //   50: monitorexit
    //   51: aload_1
    //   52: invokestatic 51	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   55: ifeq +57 -> 112
    //   58: aload_0
    //   59: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   62: invokestatic 34	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:access$getMTimeZoneData	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;)Ljava/lang/Object;
    //   65: astore_1
    //   66: aload_1
    //   67: monitorenter
    //   68: new 36	java/util/ArrayList
    //   71: dup
    //   72: aload_0
    //   73: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   76: invokestatic 30	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:getFilter	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;)Ljava/util/List;
    //   79: invokespecial 42	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   82: astore_3
    //   83: aload_1
    //   84: monitorexit
    //   85: aload_2
    //   86: aload_3
    //   87: putfield 55	android/widget/Filter$FilterResults:values	Ljava/lang/Object;
    //   90: aload_2
    //   91: aload_3
    //   92: invokeinterface 61 1 0
    //   97: putfield 65	android/widget/Filter$FilterResults:count	I
    //   100: aload_2
    //   101: areturn
    //   102: astore_1
    //   103: aload_3
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    //   107: astore_2
    //   108: aload_1
    //   109: monitorexit
    //   110: aload_2
    //   111: athrow
    //   112: aload_0
    //   113: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   116: invokestatic 34	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:access$getMTimeZoneData	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;)Ljava/lang/Object;
    //   119: astore_3
    //   120: aload_3
    //   121: monitorenter
    //   122: new 36	java/util/ArrayList
    //   125: dup
    //   126: aload_0
    //   127: getfield 10	fr/CHEF-KOCH/disableads/ui/CursorFilter:this$0	Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;
    //   130: invokestatic 30	fr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter:getFilter	(Lfr/CHEF-KOCH/disableads/ui/TimeZoneFilterTypeAdapter;)Ljava/util/List;
    //   133: invokespecial 42	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   136: astore 4
    //   138: aload_3
    //   139: monitorexit
    //   140: new 36	java/util/ArrayList
    //   143: dup
    //   144: invokespecial 66	java/util/ArrayList:<init>	()V
    //   147: astore_3
    //   148: aload 4
    //   150: invokeinterface 70 1 0
    //   155: astore 4
    //   157: aload 4
    //   159: invokeinterface 76 1 0
    //   164: ifne +25 -> 189
    //   167: aload_2
    //   168: aload_3
    //   169: putfield 55	android/widget/Filter$FilterResults:values	Ljava/lang/Object;
    //   172: aload_2
    //   173: aload_3
    //   174: invokeinterface 61 1 0
    //   179: putfield 65	android/widget/Filter$FilterResults:count	I
    //   182: aload_2
    //   183: areturn
    //   184: astore_1
    //   185: aload_3
    //   186: monitorexit
    //   187: aload_1
    //   188: athrow
    //   189: aload 4
    //   191: invokeinterface 80 1 0
    //   196: checkcast 82	fr/CHEF-KOCH/disableads/adapters/AppInfo
    //   199: astore 5
    //   201: aload 5
    //   203: getfield 86	fr/CHEF-KOCH/disableads/adapters/AppInfo:id	Ljava/lang/String;
    //   206: invokestatic 92	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   209: invokevirtual 98	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   212: aload_1
    //   213: invokeinterface 104 1 0
    //   218: invokevirtual 106	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   221: invokevirtual 109	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   224: ifeq -67 -> 157
    //   227: aload_3
    //   228: aload 5
    //   230: invokeinterface 113 2 0
    //   235: pop
    //   236: goto -79 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	CursorFilter
    //   0	239	1	paramCharSequence	CharSequence
    //   7	94	2	localFilterResults	Filter.FilterResults
    //   107	76	2	localThrowable	Throwable
    //   25	203	3	localObject1	Object
    //   136	54	4	localObject2	Object
    //   199	30	5	localAppInfo	fr.CHEF-KOCH.disableads.adapters.AppInfo
    // Exception table:
    //   from	to	target	type
    //   28	51	102	java/lang/Throwable
    //   103	105	102	java/lang/Throwable
    //   68	85	107	java/lang/Throwable
    //   108	110	107	java/lang/Throwable
    //   122	140	184	java/lang/Throwable
    //   185	187	184	java/lang/Throwable
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    TimeZoneFilterTypeAdapter.access$setMLiveResults(this$0, (List)values);
    if (count > 0)
    {
      this$0.notifyDataSetChanged();
      return;
    }
    this$0.notifyDataSetInvalidated();
  }
}

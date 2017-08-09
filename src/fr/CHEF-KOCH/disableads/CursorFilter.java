package fr.tvbarthel.disableservice;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import fr.tvbarthel.disableservice.adapters.Station;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class CursorFilter
  extends Filter
{
  private CursorFilter(CursorAdapter paramCursorAdapter) {}
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    Object localObject1;
    if (CursorAdapter.access$getData(this$0) == null) {
      localObject1 = CursorAdapter.access$getMUsername(this$0);
    }
    try
    {
      CursorAdapter.init(this$0, new ArrayList(CursorAdapter.getInstance(this$0)));
      if (TextUtils.isEmpty(paramCharSequence)) {
        paramCharSequence = CursorAdapter.access$getMUsername(this$0);
      }
      localObject1 = CursorAdapter.access$getMUsername(this$0);
    }
    catch (Throwable paramCharSequence)
    {
      try
      {
        localObject1 = new ArrayList(CursorAdapter.access$getData(this$0));
        values = localObject1;
        count = ((List)localObject1).size();
        return localFilterResults;
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
      paramCharSequence = paramCharSequence;
      throw paramCharSequence;
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject2 = new ArrayList(CursorAdapter.access$getData(this$0));
        localObject1 = new ArrayList();
        localObject2 = ((List)localObject2).iterator();
        if (!((Iterator)localObject2).hasNext())
        {
          values = localObject1;
          count = ((List)localObject1).size();
          return localThrowable;
        }
      }
      catch (Throwable paramCharSequence)
      {
        throw paramCharSequence;
      }
      Station localStation = (Station)((Iterator)localObject2).next();
      if (((CursorAdapter.runQueryOnBackgroundThread(this$0)) && (name.toLowerCase(Locale.getDefault()).contains(paramCharSequence.toString().toLowerCase(Locale.getDefault())))) || ((!CursorAdapter.runQueryOnBackgroundThread(this$0)) && (name.substring(name.lastIndexOf(".") + 1).toLowerCase(Locale.getDefault()).contains(paramCharSequence.toString().toLowerCase(Locale.getDefault()))))) {
        ((List)localObject1).add(localStation);
      }
    }
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    CursorAdapter.set(this$0, (List)values);
    if (count > 0)
    {
      this$0.notifyDataSetChanged();
      return;
    }
    this$0.notifyDataSetInvalidated();
  }
}

package fr.tvbarthel.disableservice;

import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;

public abstract class CursorAdapter
  extends BaseAdapter
  implements Filterable
{
  private List a;
  private List data;
  private boolean mCursor;
  private CursorFilter mCursorFilter;
  private Object mUsername = new Object();
  
  public CursorAdapter(List paramList)
  {
    a = paramList;
  }
  
  public int getCount()
  {
    return a.size();
  }
  
  public Filter getFilter()
  {
    if (mCursorFilter == null) {
      mCursorFilter = new CursorFilter(this, null);
    }
    return mCursorFilter;
  }
  
  public Object getItem(int paramInt)
  {
    return a.get(paramInt);
  }
  
  public boolean getItem()
  {
    return mCursor;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
  
  public void init(List paramList)
  {
    a.clear();
    if (paramList != null) {
      a.addAll(paramList);
    }
    if (data != null)
    {
      data.clear();
      data = null;
    }
    notifyDataSetChanged();
  }
  
  public void swapCursor()
  {
    if (mCursor) {}
    for (boolean bool = false;; bool = true)
    {
      mCursor = bool;
      notifyDataSetChanged();
      return;
    }
  }
}

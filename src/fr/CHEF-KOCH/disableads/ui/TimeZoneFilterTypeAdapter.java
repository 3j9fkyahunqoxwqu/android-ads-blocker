package fr.CHEF-KOCH.disableads.ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import fr.CHEF-KOCH.disableads.Preferences;
import fr.CHEF-KOCH.disableads.adapters.AppInfo;
import java.util.ArrayList;
import java.util.List;

class TimeZoneFilterTypeAdapter
  extends BaseAdapter
  implements Filterable
{
  private Context activity;
  private CursorFilter mCursorFilter;
  private List mFilter;
  private Object mTimeZoneData = new Object();
  private List parent;
  private PackageManager pm;
  
  public TimeZoneFilterTypeAdapter(SearchFragment paramSearchFragment, Context paramContext)
  {
    activity = paramContext;
    parent = new ArrayList();
    pm = paramContext.getPackageManager();
  }
  
  public void add(int paramInt)
  {
    AppInfo localAppInfo = (AppInfo)getItem(paramInt);
    x = Preferences.get(name, activity.getPackageManager());
    c = Preferences.remove(name, Preferences.getInstance(activity));
    parent.set(paramInt, localAppInfo);
  }
  
  public int getCount()
  {
    return parent.size();
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
    return parent.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppInfo localAppInfo = (AppInfo)parent.get(paramInt);
    Object localObject;
    if (paramView == null)
    {
      localObject = LayoutInflater.from(activity).inflate(2130903063, null);
      paramView = (View)localObject;
      paramViewGroup = new Item(this, null);
      type = ((ImageView)((View)localObject).findViewById(2131361834));
      title = ((TextView)((View)localObject).findViewById(2131361852));
      owner = ((TextView)((View)localObject).findViewById(2131361855));
      id = ((TextView)((View)localObject).findViewById(2131361854));
      name = ((TextView)((View)localObject).findViewById(2131361853));
      ((View)localObject).setTag(paramViewGroup);
    }
    for (;;)
    {
      String str;
      if (icon == null)
      {
        localObject = pm;
        str = name;
      }
      try
      {
        localObject = ((PackageManager)localObject).getApplicationIcon(str);
        icon = ((Drawable)localObject);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          localNameNotFoundException.printStackTrace();
          icon = activity.getResources().getDrawable(17301651);
          continue;
          id.setVisibility(0);
          id.setText(Integer.toString(x));
        }
        name.setVisibility(0);
        name.setText(Integer.toString(paramInt));
      }
      type.setImageDrawable(icon);
      title.setText(id);
      owner.setText(Integer.toString(code));
      if (x != 0) {
        break;
      }
      id.setVisibility(4);
      paramInt = c;
      if (paramInt != 0) {
        break label300;
      }
      name.setVisibility(8);
      return paramView;
      paramViewGroup = (Item)paramView.getTag();
    }
    label300:
    return paramView;
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
  }
  
  public void setData(List paramList)
  {
    parent.clear();
    if (paramList != null) {
      parent.addAll(paramList);
    }
    notifyDataSetChanged();
  }
}

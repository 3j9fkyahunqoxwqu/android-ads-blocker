package fr.CHEF-KOCH.disableads.ui;

import android.content.ContextWrapper;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import fr.CHEF-KOCH.disableads.CursorAdapter;
import fr.CHEF-KOCH.disableads.Preferences;
import fr.CHEF-KOCH.disableads.adapters.Station;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManagerActivity
  extends MainActivity
{
  private AbstractBackendPreference.Adapter currentDirectory;
  private String user;
  
  public FileManagerActivity() {}
  
  private List doInBackground()
  {
    PackageManager localPackageManager = getActivity().getPackageManager();
    ServiceInfo[] arrayOfServiceInfo = Preferences.getName(user, localPackageManager);
    List localList = Preferences.getInstance(getActivity());
    ArrayList localArrayList = new ArrayList();
    int j = arrayOfServiceInfo.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        Collections.sort(localArrayList, new Controller.1(this));
        return localArrayList;
      }
      ServiceInfo localServiceInfo = arrayOfServiceInfo[i];
      Station localStation = new Station();
      name = name;
      packageName = packageName;
      version = Preferences.get(localServiceInfo, localPackageManager);
      status = Preferences.get(packageName, name, localList);
      localArrayList.add(localStation);
      i += 1;
    }
  }
  
  public static FileManagerActivity newInstance(Bundle paramBundle)
  {
    FileManagerActivity localFileManagerActivity = new FileManagerActivity();
    localFileManagerActivity.setArguments(paramBundle);
    return localFileManagerActivity;
  }
  
  protected CursorAdapter browseTo()
  {
    currentDirectory = new AbstractBackendPreference.Adapter(this, getActivity(), doInBackground());
    setListAdapter(currentDirectory);
    return currentDirectory;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    user = getArguments().getString("packageName");
  }
  
  protected void onListItemClick(Integer... paramVarArgs)
  {
    currentDirectory.init(doInBackground());
  }
}

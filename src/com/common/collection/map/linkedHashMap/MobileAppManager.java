package com.common.collection.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MobileAppManager extends LinkedHashMap<String,MobileApp> {

    public int maximumNumberOfApp;
    boolean isRecentView;

    public MobileAppManager( int maximumNumberOfApp,boolean isRecentView){
        super(maximumNumberOfApp,0.75f, isRecentView);
        this.maximumNumberOfApp = maximumNumberOfApp;
        this.isRecentView = isRecentView;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, MobileApp> eldest) {
        if(isRecentView){
            return size() > maximumNumberOfApp;
        }
        else{
            return false;
        }
    }

    public void findValue(String key){
        if(containsKey(key)){
            System.out.println("Your App : " + get(key).getAppName());
        }
        else{
            System.out.println(get(key) + " is not found");
        }
    }
    //Install App
    public void installApp(String appId, String appName,String version, boolean isInstall){
        MobileApp mobileApp = new MobileApp(appId,appName,version,isInstall);
        put(appId,mobileApp);
        System.out.println(appName + " is installed successfully");
    }

    //View App List
    public void appList(){
        System.out.println("App List : ");
        for(MobileApp mobileApp : values()){
            System.out.println("-> " + mobileApp.getAppName());
        }
    }

}

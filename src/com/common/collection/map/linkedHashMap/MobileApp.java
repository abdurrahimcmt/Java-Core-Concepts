package com.common.collection.map.linkedHashMap;

public class MobileApp {
    private String appId;
    private String appName;
    private String version;
    private boolean isInstall;

    public MobileApp(String appId, String appName, String version, boolean isInstall) {
        this.appId = appId;
        this.appName = appName;
        this.version = version;
        this.isInstall = isInstall;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isInstall() {
        return isInstall;
    }

    public void setInstall(boolean install) {
        isInstall = install;
    }
}

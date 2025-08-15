package com.common.collection.map.linkedHashMap;

public class OrderedApp {
    MobileAppManager mbManager = new MobileAppManager(6,false);

    public OrderedApp(){
        installation();
        mbManager.appList();
        System.out.println("List size: " + mbManager.size());
        mbManager.findValue("1");
        mbManager.findValue("4");
        mbManager.installApp("7","Massager","1",true);
        mbManager.installApp("8","Tiktok","1",true);
        mbManager.installApp("9","Linkedin","1",true);
        System.out.println("Updated List: ");
        mbManager.appList();

        System.out.println("List size: " + mbManager.size());

    }
    public void installation(){
        mbManager.installApp("1","FaceBook","1",true);
        mbManager.installApp("2","WhatsApp","1",true);
        mbManager.installApp("3","Youtube","1",true);
        mbManager.installApp("4","Chrome","1",true);
        mbManager.installApp("5","Photos","1",true);
        mbManager.installApp("6","Drive","1",true);
    }
}

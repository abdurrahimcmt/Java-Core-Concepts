package com.common.collection.map.weakHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class EventManager {
    Map<EventListenerInterface,String> event = new WeakHashMap<>();

    public void eventRegistry(EventListenerInterface eventTask,String massage){
        event.put(eventTask,massage);
        System.out.println("Event Registered Successfully");
    }
    public void RunEvent(String notifyAllEvent){
        System.out.println("Notify All EventListener");
        for(EventListenerInterface eventListener : event.keySet()){
            eventListener.eventTask(notifyAllEvent);
        }
    }
    public void printListeners(){
        System.out.println("EventListeners list -> ");
        for(String eventName : event.values()){
            System.out.println(" -> " + eventName);
        }
    }
}

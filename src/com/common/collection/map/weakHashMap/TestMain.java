package com.common.collection.map.weakHashMap;

public class TestMain {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        EventListenerInterface event1 = new EventListenerInterface() {
            @Override
            public void eventTask(String massage) {
                System.out.println("Listener 1 = " + massage);
            }
        };
        EventListenerInterface event2 = new EventListenerInterface() {
            @Override
            public void eventTask(String massage) {
                System.out.println("Listener 2 = " + massage);
            }
        };

        eventManager.eventRegistry(event1, " Event 1");
        eventManager.eventRegistry(event2, "Event 2"); ;

        eventManager.RunEvent("Hi listeners");

        eventManager.printListeners();
        event1 = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        eventManager.RunEvent("Hi listeners");
        eventManager.printListeners();

    }
}

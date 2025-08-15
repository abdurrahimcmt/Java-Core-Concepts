package com.common.collection.queue.ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class MultipleThreadManager {
    ConcurrentLinkedQueue<String> linkedQueue = new ConcurrentLinkedQueue<>();
    Thread t1 = new Thread(new Producer(linkedQueue));
    Thread t2 = new Thread(new Consumer(linkedQueue));

    public MultipleThreadManager(){
        t1.start();
        t2.start();
    }

}

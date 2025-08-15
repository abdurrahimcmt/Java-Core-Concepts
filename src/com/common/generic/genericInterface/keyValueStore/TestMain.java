package com.common.generic.genericInterface.keyValueStore;

public class TestMain {
    public static void main(String[] args) {
        KeyValueStore<String,Integer> storeValue = new StoreValue<>();
        storeValue.add("Rahim", 30);
        System.out.println("Rahim's Age : "+ storeValue.get("Rahim"));

        storeValue.remove("Rahim");
        System.out.println("Rahim's Age : "+ storeValue.get("Rahim"));
    }
}

package com.common.generic.genericConstructor;

public class GenericConstructor {
    //
    public <T extends Number> GenericConstructor(T value) {
        System.out.println(value);
        System.out.println(value.getClass().getName());
    }
    //Allow multiple type parameter
    public <K,V> GenericConstructor(K key,V value){
        System.out.println("Key " + key + " Value " + value);
    }


}

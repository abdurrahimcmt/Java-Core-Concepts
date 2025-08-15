package com.common.generic.genericInterface.keyValueStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreValue<K,V> implements KeyValueStore<K,V>{
    public Map<K,V> map = new HashMap<>();
    @Override
    public void add(K key, V value) {
        map.put(key,value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public void remove(K Key) {
        map.remove(Key);
    }

}

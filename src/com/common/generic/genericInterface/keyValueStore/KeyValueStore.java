package com.common.generic.genericInterface.keyValueStore;

import java.util.List;

public interface KeyValueStore<K,V> {
    void add(K key, V value);
    V get(K key);
    void remove(K Key);
}

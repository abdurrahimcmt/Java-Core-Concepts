package com.common.generic.genericInterface.processor;

public interface Processor<T> {
    T process(T input);
}

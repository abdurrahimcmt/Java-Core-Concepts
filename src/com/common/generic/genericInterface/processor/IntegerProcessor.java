package com.common.generic.genericInterface.processor;

public class IntegerProcessor implements Processor<Integer>{
    @Override
    public Integer process(Integer input) {
        return input * 100;
    }
}

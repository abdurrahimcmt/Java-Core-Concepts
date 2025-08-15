package com.common.generic.genericInterface.processor;

public class StringProcessor implements Processor<String>{
    @Override
    public String process(String input) {
        return input.toUpperCase();
    }
}

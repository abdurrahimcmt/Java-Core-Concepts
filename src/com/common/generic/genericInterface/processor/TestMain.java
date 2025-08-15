package com.common.generic.genericInterface.processor;

public class TestMain {
    public static void main(String[] args) {
        Processor<String> stringProcessor = new StringProcessor();
        String name = stringProcessor.process("Abdur Rahim");
        Processor<Integer> integerProcessor = new IntegerProcessor();
        int amount = integerProcessor.process(25);
        System.out.println("Name : " + name + " Amount : " + amount);
    }
}

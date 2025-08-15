package com.common.oop.polymorphism;

public class MethodOverloading {
    public void sum(int a, int b){
        System.out.println("Sum : " + (a + b));
    }

    public void sum(int a, int b, int c){
        System.out.println("Sum : " + (a + b + c));
    }

    public void Subtraction(int a, int b){
        System.out.println("Subtraction : " + (a - b));
    }
}

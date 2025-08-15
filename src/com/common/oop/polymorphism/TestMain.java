package com.common.oop.polymorphism;

public class TestMain {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.sum(50,50);
        methodOverloading.sum(50,50,50);
        /////Overriding
        MethodOverriding methodOverriding = new MethodOverriding();
        methodOverriding.animalSound();
        Animal cat = new Cat();
        cat.sound();
    }
}

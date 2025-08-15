package com.common.oop.polymorphism;

public class MethodOverriding {
    public void animalSound(){
        Animal catSound = new Cat();
        catSound.sound();
        Animal dogSound = new Dog();
        dogSound.sound();
    }
}

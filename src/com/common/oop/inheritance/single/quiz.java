package com.common.oop.inheritance.single;

public class quiz {
    public static void main(String[] args) {
        DogAnimal dog = new DogAnimal();
        dog.eat();
        dog.sound();
    }
}
class parentAnimal{
    public void eat(){
        System.out.println("Animal food");
    }
}
class DogAnimal extends parentAnimal{
    public void sound(){
        System.out.println("boooooowwwww");
    }
}
package com.common.oop.inheritance.hierarchical;

public class TestMain {
    public static void main(String[] args) {
        CatChild catChild = new CatChild();
        catChild.eat();
        catChild.sound();
        catChild.feed();

        DogChild dogChild = new DogChild();
        dogChild.eat();
        dogChild.sound();
        dogChild.feed();
    }
}

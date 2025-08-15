package com.common.solid.lsp;

interface  BirdFood{
    void eat();
}
interface FlyingBird{
   void fly();
}

class OstrichBird implements BirdFood{

    @Override
    public void eat() {
        System.out.println("Ostrich can eat bird food");
    }
}

class hamimBird implements BirdFood,FlyingBird{

    @Override
    public void eat() {
        System.out.println("Hamim Bird eat bird food");
    }

    @Override
    public void fly() {
        System.out.println("Hamim bird can fly quickly");
    }
}

public class BirdTestWithLSP {
    public static void main(String[] args) {
        FlyingBird flyingBird = new hamimBird();
        flyingBird.fly();
        BirdFood birdFood = new OstrichBird();
        birdFood.eat();
    }
}

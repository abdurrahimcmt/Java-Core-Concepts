package com.common.solid.lsp;

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Ostrich();

        bird1.fly(); // OK
        bird2.fly(); // 💥 Crash! Violates LSP
    }
}

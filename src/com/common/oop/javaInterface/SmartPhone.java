package com.common.oop.javaInterface;

public class SmartPhone implements Camera,MideaPlayer, Radio,Telephone,Calculator{
    @Override
    public void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    @Override
    public void minus(int a, int b) {
        System.out.println("Minus: " + (a - b) );
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiply: " + (a * b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division: " + (a / b));
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo captured successfully");
    }

    @Override
    public void takeVideo() {
        System.out.println("Video recorded successfully");
    }

    @Override
    public void musicStart() {
        System.out.println("Music start successfully");
    }

    @Override
    public void musicStop() {
        System.out.println("Music end successfully");
    }

    @Override
    public void radioStart() {
        System.out.println("Radio start successfully");
    }

    @Override
    public void radioStop() {
        System.out.println("Radio stop successfully");
    }

    @Override
    public void callStart() {
        System.out.println("Call start successfully");
    }

    @Override
    public void callEnd() {
        System.out.println("Call end successfully");
    }

}

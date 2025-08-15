package com.common.oop.javaInterface;

public class TestMain {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.callStart();
        sm.callEnd();
        sm.radioStart();
        sm.radioStop();

        //static constance
        System.out.println(Radio.radioFrequency);

        sm.sum(10,15);
        sm.division(500,4);
        sm.multiply(8,60);
        sm.minus(152455,25);
        sm.musicStart();
        sm.musicStop();

        //default method
        sm.changeMusic();

        sm.takeVideo();
        sm.takePhoto();
        //static method

        Camera.slowMotion();

    }
}

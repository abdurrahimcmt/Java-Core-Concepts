package com.common.oop.javaInterface;

public interface Camera {
    String maxResulation = "50mb";
    void takePhoto();
    void takeVideo();

    static void slowMotion(){
        System.out.println("Slow motion start");
    }
}

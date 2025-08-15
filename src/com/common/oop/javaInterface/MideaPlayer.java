package com.common.oop.javaInterface;

public interface MideaPlayer {
    void musicStart();
    void musicStop();
    default void changeMusic(){
        System.out.println("Music Changed");
    }
    private void musicPlayerName(){
        System.out.println("Max Player");
    }
}

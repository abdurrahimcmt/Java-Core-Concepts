package com.common.nestedClass.memberInnerClass;

public class testClass {
    public static void main(String[] args) {
        Car car = new Car("Hino", "3l", "TATA");
        Car.Engine carEngine = car.new Engine();
        carEngine.engineStart();
        carEngine.engineStatus();
        carEngine.engineStop();
        carEngine.engineStatus();
    }
}

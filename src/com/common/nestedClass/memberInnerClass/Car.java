package com.common.nestedClass.memberInnerClass;

public class Car {
    final String carName;
    final String carModel;
    final String company;
    public boolean isEngineON;
    public Car(String carName, String carModel, String company) {
        this.carName = carName;
        this.carModel = carModel;
        this.company = company;
        isEngineON = false;
    }
    class Engine {
        public Engine() {
            System.out.println("Welcome to the Car. Name: " + carName + " Model: " + carModel + " Company: " + company);
        }
        public void engineStatus(){
            if(isEngineON){
                System.out.println("Car engine is running.");
            }
            else{
                System.out.println("The car engine has stopped.");
            }
        }
        public void engineStop(){
            if(isEngineON){
                isEngineON = false;
                System.out.println("Car engine stop successfully");
            }
            else{
                System.out.println("Care engine already stopped");
            }
        }
        public void engineStart(){
            if(!isEngineON){
                isEngineON = true;
                System.out.println("Car engine start successfully");
            }
            else{
                System.out.println("Car engine already started");
            }
        }

    }



}

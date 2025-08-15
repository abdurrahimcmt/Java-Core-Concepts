package com.common.generic.genericMethod;

class PrintingServices {
    public <T> void printArray(T[] array){
        for (T element : array) {
            System.out.println(element);
        }
    }
    //Method can accept multiple type parameters
    public <K, V> void printPair(K key,V value){
        System.out.println("key: " + key + " Value: " + value);
    }

    //Generic Method can be static
    public static <T> void staticMethod(T value){
        System.out.println("Static method Value is : " + value);
    }
    //Method overloading
    public void getValue(String value){
        System.out.println("Normal Method: " + value);
    }
    public <T> void getValue(T value){
        System.out.println("Generic Method: " + value);
    }


}
public class genericMethodExample {
    public static void main(String[] args) {
        PrintingServices print = new PrintingServices();
        Integer[] array = {25,5,68,48,36,58};
        String[] NameArray = {"A","B","C","D"};
        print.printArray(array);
        print.printArray(NameArray);

        //multiple parameter
        print.printPair("Abdur Rahim", 152);
        print.printPair(100,"Number");

        //static method
        PrintingServices.staticMethod("Younus");

        //Method Overloading
        print.getValue("Rahim");
        print.getValue(25);
    }
}

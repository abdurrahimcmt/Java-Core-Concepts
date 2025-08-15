package com.common.basicTest;

import java.util.Scanner;

public class UserInput {
    public UserInput(){
        sum();
    }
    public void sum(){
        int number1, number2;
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter you first number: ");
        number1 = input.nextInt();

        System.out.print("Please enter you second number: ");
        number2 = input.nextInt();

        System.out.println("Your numbers sum: " + (number1 + number2));
    }
}

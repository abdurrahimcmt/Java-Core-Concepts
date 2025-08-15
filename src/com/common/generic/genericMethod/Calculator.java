package com.common.generic.genericMethod;

enum Operation{
    Add, Subtraction, Multiplication, Division, Module, Power;

    public <T extends Number> double calculate(T a,T b){
        switch (this){
            case Add:
                return ( a.doubleValue() + b.doubleValue());
            case Subtraction:
                return (a.doubleValue() - b.doubleValue());
            case Multiplication:
                return (a.doubleValue() * b.doubleValue());
            case Division: {
                if (b.doubleValue() == 0.0) {
                    throw new ArithmeticException();
                }
                return (a.doubleValue() / b.doubleValue());
            }
            case Module:
                return (a.doubleValue() % b.doubleValue());
            case Power:
                return (Math.pow(a.doubleValue(),b.doubleValue()));
            default: throw new RuntimeException("Your operation is not valid");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        System.out.println("ADD: " + Operation.Add.calculate(5,10));
        System.out.println("SUBTRACTION: " + Operation.Subtraction.calculate(155,100));
        System.out.println("MULTIPLICATION: " + Operation.Multiplication.calculate(5,10));
        System.out.println("DIVISION: " + Operation.Division.calculate(100,10));
        System.out.println("MODULE: " + Operation.Module.calculate(4,106));
        System.out.println("POWER: " + Operation.Power.calculate(4,4));

    }
}

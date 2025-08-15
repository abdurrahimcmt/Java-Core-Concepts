package com.common.solid.ocp;

interface  DiscountStrategy{
    double getDiscount(double amount);
}
class RegularCustomer implements DiscountStrategy{

    @Override
    public double getDiscount(double amount) {
        return amount * 0.05;
    }
}
class PremiumCustomer implements DiscountStrategy{

    @Override
    public double getDiscount(double amount) {
        return amount * 0.10;
    }
}
class GoldCustomer implements DiscountStrategy{

    @Override
    public double getDiscount(double amount) {
        return amount * 0.20;
    }
}

class PlatinumCustomer implements DiscountStrategy{

    @Override
    public double getDiscount(double amount) {
        return amount * 0.40;
    }
}

public class DiscountCalculatorOCP {
    public static void main(String[] args) {
        DiscountStrategy goldCustomer = new PlatinumCustomer();
        double discount =  goldCustomer.getDiscount(200);
        System.out.println("Discount is : " + discount);
    }
}
// This satisfy OCP now if you need to add another customer type
// then you should create a new class and implement interface
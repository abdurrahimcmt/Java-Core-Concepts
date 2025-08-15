package com.common.solid.ocp;
public class testMain {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double totalDiscount = discountCalculator.calculateDiscount("PREMIUM",400.00);
        System.out.println("Discount amount: " + totalDiscount);
    }
}

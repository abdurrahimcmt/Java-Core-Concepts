package com.common.solid.ocp;
public class DiscountCalculator {
    public double calculateDiscount(String customerType, double totalAmount) {
        return switch (customerType) {
            case "REGULAR" -> totalAmount * 0.05;
            case "PREMIUM" -> totalAmount * 0.10;
            case "GOLD" -> totalAmount * 0.20;
            default -> 0.0;
        };
    }
}
/// This class violate OCP
/// If we need to add another customer type then you should edit this class which violate OCP
/// You need to test full functionality of the class
///
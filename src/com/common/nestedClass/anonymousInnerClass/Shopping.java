package com.common.nestedClass.anonymousInnerClass;

public class Shopping {
    final String customerName;
    public Shopping(String customerName) {
        this.customerName = customerName;
    }

    creditCard proceedPayment = new creditCard() {
        @Override
        public void makePayment() {
            System.out.println( customerName + "Your Payment successfully");
        }
    };
}

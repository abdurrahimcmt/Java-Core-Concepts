package com.common.nestedClass.anonymousInnerClass;

public class testMain {
    public static void main(String[] args) {
        Shopping shopping = new Shopping("Kawa Kader");
        creditCard card = shopping.proceedPayment;
        card.makePayment();
    }
}

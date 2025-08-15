package com.common.nestedClass.staticNestedClass;

public class testMain {
    public static void main(String[] args) {
        School school = new School("Class One ");
        school.intro();
        School.classTotalAmount totalAmount = new School.classTotalAmount(500);
        totalAmount.totalFee();
    }
}

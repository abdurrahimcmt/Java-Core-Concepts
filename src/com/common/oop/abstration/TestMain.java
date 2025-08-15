package com.common.oop.abstration;

public class TestMain {
    public static void main(String[] args) {
        Contractor contractor = new Contractor("Abdur Rahim", "3646", 80, 9);
        contractor.calculateSalary();
        contractor.displaySalary();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Nasir Uddin", "3564", 900);
        fullTimeEmployee.calculateSalary();
        fullTimeEmployee.displaySalary();
    }
}

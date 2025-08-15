package com.common.oop.abstration;

public class FullTimeEmployee extends Employee{
    private int dailySalary;
    private int salary;

    public FullTimeEmployee(String employeeName, String employeeId, int dailySalary) {
        super(employeeName, employeeId);
        this.dailySalary = dailySalary;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        this.setSalary(dailySalary * 30);
    }

    @Override
    public void displaySalary() {
        System.out.println("Employee Id : " + getEmployeeId() + "\nEmployee name: "+ getEmployeeName()+ "\nSalary : " + this.getSalary());
    }

}

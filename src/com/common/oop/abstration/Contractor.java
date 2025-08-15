package com.common.oop.abstration;

public class Contractor extends Employee{

    private int hourlyPay;
    private int totalHour;
    private  int salary;

    public Contractor(String employeeName, String employeeId, int hourlyPay, int totalHour) {
        super(employeeName, employeeId);
        this.hourlyPay = hourlyPay;
        this.totalHour = totalHour;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(int totalHour) {
        this.totalHour = totalHour;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        this.setSalary(this.hourlyPay * this.totalHour);
    }

    @Override
    public void displaySalary() {
        System.out.println( "Employee Id : " + getEmployeeId() + "\nEmployee name: "+ getEmployeeName()+  "\nSalary : " + this.getSalary());
    }
}

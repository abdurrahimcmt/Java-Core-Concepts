package com.common.oop.abstration;

abstract class Employee {
    private String employeeName;
    private String employeeId;

    public Employee(String employeeName,String employeeId){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public abstract void calculateSalary();
    public abstract void displaySalary();

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}

package com.common.collection.map.enumMapExample;

public class testMain {
    public static void main(String[] args) {
        LeaveManager leave = new LeaveManager();
        leave.currentBalance();
        leave.deductLeave(LeaveTypes.CASUAL, 5);
        leave.addLeave(LeaveTypes.SICK,5);
        leave.currentBalance();
    }
}

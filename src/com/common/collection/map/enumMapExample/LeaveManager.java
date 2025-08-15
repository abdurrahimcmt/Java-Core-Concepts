package com.common.collection.map.enumMapExample;

import java.util.EnumMap;

public class LeaveManager {
    EnumMap<LeaveTypes, Integer> leaveBalance;

    public LeaveManager() {
        leaveBalance = new EnumMap<>(LeaveTypes.class);
        for(LeaveTypes type: LeaveTypes.values()){
            leaveBalance.put(type,10);
        }
    }
    //Check current leave balance.
    public void currentBalance(){
        System.out.println("Current leave balance sheet");
        for(LeaveTypes type : leaveBalance.keySet()){
            System.out.println(type + " -> " + leaveBalance.get(type));
        }
    }
    //Deduct leave.
    public void deductLeave(LeaveTypes types, Integer day){
        if(leaveBalance.containsKey(types)){
            Integer oldBalance = leaveBalance.getOrDefault(types,0);
            if(oldBalance >= day){
                leaveBalance.put(types,oldBalance-day);
                System.out.println("✅ Leave approved. " + day + " days of " + types + " leave taken.");
            }
            else{
                System.out.println("❌ Not enough balance for " + types + " leave.");
            }
        }
        else{
            System.out.println("Not valid leave");
        }
    }

    //Add leave.
    public void addLeave(LeaveTypes type,Integer day){
        if(leaveBalance.containsKey(type)){
            Integer oldBalance = leaveBalance.getOrDefault(type,0);
            leaveBalance.put(type, day+oldBalance);
            System.out.println("✅ Leave added. " + day + " days of " + type + " successfully");
        }
        else{
            System.out.println("Not valid leave");
        }
    }

   // Print all balances.


}


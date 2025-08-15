package com.common.nestedClass.localInnerClass;

public class Hotel {
    final String name;
    final int totalRoom;
    private int reservedRoom;

    public Hotel(String name, int totalRoom, int reservedRoom) {
        this.name = name;
        this.totalRoom = totalRoom;
        this.reservedRoom = reservedRoom;
    }

    public void reservation(String customerName, int numberOfRooms){
        class Reservation{
            public int hotelRooms;
            public boolean validation(){
                if(customerName.isEmpty()){
                    System.out.println("Please insert customer name");
                    return false;
                }
                if(numberOfRooms < 1){
                    System.out.println("Number of room is not correct");
                    return false;
                }
                if(numberOfRooms > (totalRoom - reservedRoom)){
                    System.out.println("Sorry " + customerName +" we have not sufficient rooms");
                    return false;
                }
                else{
                    if(numberOfRooms == 1){
                        reservedRoom += numberOfRooms;
                        System.out.println("Hi " + customerName + " " +  numberOfRooms + " Room booking successfully" );
                    }
                    else{
                        reservedRoom += numberOfRooms;
                        System.out.println("Hi " + customerName + " " +  numberOfRooms + " Rooms are booking successfully" );
                    }
                    return true;
                }
            }
        }

        Reservation reservation = new Reservation();
        if(reservation.validation()){
            System.out.println("Done, Welcome to " + name);
        }
        else{
            System.out.println("Sorry," +customerName+ ", try again letter thanks");
        }
    }
}

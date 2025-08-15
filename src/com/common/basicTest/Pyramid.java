package com.common.basicTest;

public class Pyramid {
    int row = 5,count = 0, column = 0;
    public Pyramid(){
        init();
    }
    public void init(){
        System.out.println("Right com.common.basicTest.Pyramid");
        rightPyramid();

        System.out.println("Left com.common.basicTest.Pyramid");
        leftPyramid();

        System.out.println("Straight com.common.basicTest.Pyramid");
        straightPyramid();

        System.out.println("Reverse com.common.basicTest.Pyramid");
        reversePyramid();
    }
    public void rightPyramid(){
        for(count = 0;count <= row; count++){
            for(column = 0; column<= count ; column ++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public void leftPyramid(){
        row = 5;
        for(count = row;count >= 0; count--){
            for(column = 0; column<= count ; column ++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public void straightPyramid(){
        row = 5;
        for(count = 0;count <= row; count++){
            for(column = 0; column<= (row - count); column ++){
                System.out.print(" ");
            }
            for(column = 0; column<= count; column ++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public void reversePyramid(){
        row = 5;
        for(count = row;count >= 0; count--){
            for(column = 0; column <= (row - count); column ++){
                System.out.print(" ");
            }
            for(column = 0; column<= count; column ++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

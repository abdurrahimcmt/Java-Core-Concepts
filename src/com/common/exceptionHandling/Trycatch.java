package com.common.exceptionHandling;

public class Trycatch {
    int[] arr1 = {10,20,30,40};
    int[] arr2 = {2,4,0,8};
    int result = 0;

    public void divition(){
        int count = 0;
        while (count < arr1.length){
            try {
                result =  arr1[count] / arr2[count];
                count++;
                System.out.println(result);

            }catch (ArithmeticException e){
                count++;
                System.out.println(e);
            }
        }
    }
}

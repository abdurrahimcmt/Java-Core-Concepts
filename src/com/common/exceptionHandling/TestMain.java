package com.common.exceptionHandling;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Trycatch trycatch = new Trycatch();
        trycatch.divition();
        //Throw
        ThrowException throwException = new ThrowException();
        Student student =  throwException.addStudent(1,"kamal",15, false);
        System.out.println(student);
    }
}

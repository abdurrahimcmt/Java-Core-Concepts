package com.common.generic.boundedGenerics;

public class AreaCalculator <T extends Shape>{
    T[] arrayShape;

    public AreaCalculator(T[] arrayShape) {
        this.arrayShape = arrayShape;
    }
    public double totalArea(){
        double num = 0;
        for(T shape: arrayShape){
            num += shape.getArea();
        }
        return num;
    }
}

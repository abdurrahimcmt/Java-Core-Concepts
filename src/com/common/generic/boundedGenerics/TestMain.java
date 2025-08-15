package com.common.generic.boundedGenerics;

public class TestMain {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
            new Rectangle(25,45),
            new Rectangle(35,48)
        };
        AreaCalculator<Rectangle> areaCalculator = new AreaCalculator<>(rectangles);
        System.out.println("Total Area : " + areaCalculator.totalArea());

        Circle[] circles = {
                new Circle(45),
                new Circle(35)
        };
        AreaCalculator<Circle> circleAreaCalculator = new AreaCalculator<>(circles);
        System.out.println("Total Area : " + circleAreaCalculator.totalArea());

        Triangle[] triangles = {
          new Triangle(5,16),
          new Triangle(5,40)
        };

        AreaCalculator<Triangle> triangleAreaCalculator = new AreaCalculator<>(triangles);
        System.out.println("Total Area: " + triangleAreaCalculator.totalArea());
    }
}

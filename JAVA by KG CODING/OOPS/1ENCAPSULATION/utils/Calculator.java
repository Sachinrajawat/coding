package utils;

import geometry.circle;
import geometry.rectangle;

public class Calculator {
    public static void main(String[] args) {
        circle cir = new circle(5.5);
        rectangle react = new rectangle(10,5);
        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = react.length*react.breadth;
        System.out.printf("Area of the circle is: %f, Area of the rectangle is: %f",cirArea,rectArea);
    }
}

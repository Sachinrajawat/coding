// package JAVA KG CODING.OOPS.2ABSTRACTION;

import java.util.Scanner;

public abstract class Shape {
    public abstract void calculateArea();
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        Square square = new Square(8);
        square.calculateArea();
    }
}

class Circle extends Shape{
int radius;
Circle(int radius){
    this.radius=radius;
}
public void calculateArea(){
System.out.println("Area of a circle is: "+Math.PI*Math.pow(radius, 2));
}
}
class Square extends Shape{
int side;
Square(int side){
    this.side=side;
}
public void calculateArea(){
System.out.println("Area of square is: "+Math.pow(side, 2));
}
}

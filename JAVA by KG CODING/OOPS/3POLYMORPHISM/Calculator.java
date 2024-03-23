// package JAVA KG CODING.OOPS.3POLYMORPHISM;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(5,4));
        System.out.println(calculator.add(5,4,6));
        System.out.println(calculator.add(7.1,4));
    }
}

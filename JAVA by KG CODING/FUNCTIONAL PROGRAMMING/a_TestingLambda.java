// package JAVA KG CODING.FUNCTIONAL PROGRAMMING;

public class a_TestingLambda {
    public static void main(String[] args) {
        a_TestingLambda test = new a_TestingLambda();
        int sum=test.sum(6, 4);
        test.printString("This is the best course");
    }
    public void printString(String toPrint){
        System.out.println(toPrint);
    }
    public int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}

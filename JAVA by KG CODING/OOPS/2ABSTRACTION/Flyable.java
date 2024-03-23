// package JAVA KG CODING.OOPS.2ABSTRACTION;

public interface Flyable {
    void fly();
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        
        eagle.fly();
    }
} 
abstract class Bird implements Flyable{
public void fly(){
    System.out.println("Bird is flying");
}
}
class Eagle extends Bird{
public void fly(){
    System.out.println("Eagle is flying");
}
}

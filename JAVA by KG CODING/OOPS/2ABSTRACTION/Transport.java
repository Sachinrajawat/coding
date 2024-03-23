

public interface Transport {
    void getSetGo();   //it is by default public abstract
    public static void main(String[] args) {
        
        Car car = new Car();
        car.commute();
        car.makeStartSound();
        car.getSetGo();
    }
    
}
abstract class Vehicle implements Transport {
    private int noOfTires;

    public abstract void makeStartSound();
    
    @Override
    public void getSetGo(){
        System.out.println("Going to place..");
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Going....");
    }
    
}
class Car extends Vehicle {
    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vrommmm......");
    }
}


public abstract class Vehicle {
    private int noOfTires;

    public abstract void makeStartSound();

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
    public static void main(String[] args) {
        
        Car car = new Car();
        car.commute();
        car.makeStartSound();
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




public class Vehicle {
    public void service(){
        System.out.println("Vehicle Service");
    }
    static class Car extends Vehicle{
        public void service(){
            super.service();
            System.out.println("Car Service");
        }
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.service();
    }
}

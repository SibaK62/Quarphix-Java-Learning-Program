  // Vehicle class (base class)
class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Car class (inherits from Vehicle)
class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving a car");
    }

    public void park() {
        System.out.println("Parking the car");
    }
}

// Motorcycle class (inherits from Vehicle)
class Motorcycle extends Vehicle {
    public void drive() {
        System.out.println("Driving a motorcycle");
    }

    public void wheelie() {
        System.out.println("Performing a wheelie");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();  // Output: Driving a vehicle
        System.out.println();

        Car car = new Car();
        car.drive();      // Output: Driving a car
        car.park();       // Output: Parking the car
        System.out.println();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.drive();  // Output: Driving a motorcycle
        motorcycle.wheelie();  // Output: Performing a wheelie
    }
}



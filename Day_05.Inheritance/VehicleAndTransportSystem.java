//Superclass: Vehicle
class Vehicle{
    //attributes of vehicle class
    int maxSpeed;
    String fuelType;

    //Vehicle constructor
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //display method for displaying information
    void displayInfo(){
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

//Subclass: Car
class Car extends Vehicle{

    //Addition attribute for class car
    int seatCapacity;

    //Car constructor
    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    //display method for displaying information
    @Override
    void displayInfo(){
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity : " + seatCapacity);
    }
}

//Subclass: Truck
class Truck extends Vehicle{

    //Addition attribute for class Truck
    String truckType;

    //Truck constructor
    Truck(int maxSpeed, String fuelType, String truckType){
        super(maxSpeed,fuelType);
        this.truckType = truckType;
    }
    //display method for displaying information
    @Override
    void displayInfo(){
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Truck type: " + truckType);
    }
}

//Subclass: Motorcycle
class Motorcycle extends Vehicle{

    //Addition attribute for class Motorcycle
    String brand;

    //Truck constructor
    Motorcycle(int maxSpeed, String fuelType, String brand){
        super(maxSpeed,fuelType);
        this.brand = brand;
    }
    //display method for displaying information
    @Override
    void displayInfo(){
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Brand: " + brand);
    }
}


public class VehicleAndTransportSystem {

    public static void main(String[] args) {
        // Create objects of different subclasses
        Car car = new Car(200, "Petrol", 5);
        Truck truck = new Truck(120, "Diesel", "Loader");
        Motorcycle motorcycle = new Motorcycle(180, "Petrol", "Kawaski");

        // Store the objects in an array of Vehicle type
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Display information for each vehicle
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Details:");
            vehicle.displayInfo();
            System.out.println();
        }
    }
}

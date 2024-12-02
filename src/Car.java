public class Car extends Vehicles implements LandVehicles, Maintenance {
    private int numberOfDoors;
    private int horsePower;



    public Car(String model, String make, int year, double maxSpeed, double weight, String colour, int numberOfDoors, int horsePower ) {
        super(model, make, year, maxSpeed, weight, colour);
        this.numberOfDoors = numberOfDoors;
        this.horsePower = horsePower;

    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    @Override
    public void move() {
        System.out.println("The car is moving ");


    }

    @Override
    public void turnLeft() {
        System.out.println("The car is turning left");


    }

    @Override
    public void turnRight() {
        System.out.println("The car is turning right");

    }

    @Override
    public void refuel() {
        System.out.println("The car is refueling");

    }

    @Override
    public void bookService() {
        System.out.println("The car is booking a Service");

    }

    @Override
    public String getLastServiceDate() {
        return "Last service was done on 1 December 2020";
    }

    @Override
    public void start() {
        System.out.println("The car is starting");

    }

    @Override
    public void stop() {
        System.out.println("The car is stopping");

    }

    @Override
    public String displayDetails() {
        return ("The car is details " + getMake() + " " + getModel() + " " + getYear());

    }
}

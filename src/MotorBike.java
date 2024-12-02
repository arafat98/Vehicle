public class MotorBike extends Vehicles implements LandVehicles, Maintenance{
    private String fuelType;
    private boolean hasOneSeat = false;

    public MotorBike(String model, String make, int year, double maxSpeed, double weight, String colour, String fuelType, boolean hasOneSeat) {
        super(model, make, year, maxSpeed, weight, colour);
        this.fuelType = fuelType;
        this.hasOneSeat = hasOneSeat;

    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public boolean hasOneSeat() {
        return hasOneSeat;
    }
    public void setHasOneSeat(boolean hasOneSeat) {
        this.hasOneSeat = hasOneSeat;
    }


    @Override
    public void move() {
        System.out.println("The MotorBike is moving.");


    }

    @Override
    public void turnLeft() {
        System.out.println("The MotorBike is turning left.");

    }

    @Override
    public void turnRight() {
        System.out.println("The MotorBike is turning right.");

    }

    @Override
    public void refuel() {
        System.out.println("The MotorBike is refueling.");

    }

    @Override
    public void bookService() {
        System.out.println("The MotorBike is booking service.");

    }

    @Override
    public String getLastServiceDate() {
        return "";
    }

    @Override
    public void start() {
        System.out.println("The MotorBike is starting.");

    }

    @Override
    public void stop() {
        System.out.println("The MotorBike is stopping.");

    }

    @Override
    public String displayDetails() {
        return ("The MotorBike is displaying details." + getMake() + " " + getModel() + " " + getYear() );


    }
}
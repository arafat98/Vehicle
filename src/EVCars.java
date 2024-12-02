public class EVCars extends Vehicles implements LandVehicles, Maintenance{
    private double batteryCapacity;
    private double rangePerMile;

    public EVCars(String model,String make, int year, double maxSpeed, double weight, String colour, double batteryCapacity, double rangePerMile) {
        super(model, make, year, maxSpeed, weight, colour);
        this.batteryCapacity = batteryCapacity;
        this.rangePerMile = rangePerMile;

    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
    public double getRangePerMile() {
        return rangePerMile;
    }
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;

    }
    public void setRangePerMile(double rangePerMile) {
        this.rangePerMile = rangePerMile;
    }


    @Override
    public void move() {
        System.out.println("The car is moving.");

    }

    @Override
    public void turnLeft() {
        System.out.println("The car is turning left.");

    }

    @Override
    public void turnRight() {
        System.out.println("The car is turning right.");

    }

    @Override
    public void refuel() {
        System.out.println("The car is recharging.");


    }

    @Override
    public void bookService() {
        System.out.println("The car is booking service.");

    }

    @Override
    public String getLastServiceDate() {
        return "The last service was done on 1 December 2021";
    }

    @Override
    public void start() {
        System.out.println("The car is starting.");

    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");

    }

    @Override
    public String displayDetails() {
        return("The car is displaying details." + getMake() + " " + getModel() + " " + getYear());

    }
}

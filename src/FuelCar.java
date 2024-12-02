public class FuelCar extends Vehicles implements LandVehicles, Maintenance{
    private String fuelType;
    private double mpg;

    public FuelCar(String model, String make, int yearOfReg, double maxSpeed, double weight, String colour, String fuelType, double mpg) {
        super(model, make, yearOfReg, maxSpeed, weight, colour);
        this.fuelType = fuelType;
        this.mpg = mpg;

    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public double getMpg() {
        return mpg;
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
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
        System.out.println("The car is refuling");

    }

    @Override
    public void bookService() {
        System.out.println("The car is booking the service");

    }

    @Override
    public String getLastServiceDate() {
        return "Last service date is 10 November 2020";
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

       return("The car is displaying details." + getMake() + " " + getModel() + " " + getYear());

    }
}

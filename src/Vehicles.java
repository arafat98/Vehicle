public abstract class Vehicles {
    private String model;
    private String make;
    private int yearOfReg;
    private double maxSpeed;
    private double weight;
    private String colour;
    String fuelType;

    public Vehicles(String model, String make, int yearOfReg, double maxSpeed, double weight, String colour) {
        this.model = model;
        this.make = make;
        this.yearOfReg = yearOfReg;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.colour = colour;
        this.fuelType = "";

    }


    //get
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return yearOfReg;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public String getFuelType() {
        return fuelType;
    }

    //Set
    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.yearOfReg = year;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public abstract void start();

    public abstract void stop();

    public abstract String displayDetails();


}
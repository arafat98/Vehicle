public class Bus extends Vehicles implements LandVehicles, Maintenance{
    private boolean isDoubleDecker = false;
    private int numberOfSeats;

    public Bus(String model, String make, int yearOfReg, double maxSpeed, double weight, String colour, boolean isDoubleDecker, int numberOfSeats) {
        super(model, make, yearOfReg, maxSpeed, weight, colour);
        this.isDoubleDecker = isDoubleDecker;
        this.numberOfSeats = numberOfSeats;

    }
    public boolean isDoubleDecker() {
        return isDoubleDecker;
    }
    public void setDoubleDecker(boolean isDoubleDecker) {
        this.isDoubleDecker = isDoubleDecker;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }



    @Override
    public void move() {
        System.out.println("The bus is moving ");

    }

    @Override
    public void turnLeft() {
        System.out.println("The bus is turning left");

    }

    @Override
    public void turnRight() {
        System.out.println("The bus is turning right");

    }

    @Override
    public void refuel() {
        System.out.println("The bus is refueling");

    }

    @Override
    public void bookService() {
        System.out.println("The bus is booking");

    }

    @Override
    public String getLastServiceDate() {

        return "The bus las got serviced on 1 December 2023";
    }

    @Override
    public void start() {
        System.out.println("The bus is starting");

    }

    @Override
    public void stop() {
        System.out.println("The bus is stopping");

    }

    @Override
    public String displayDetails() {

        return "Displaying the details of bus " + getMake() + " " + getModel() + " " + getYear();
    }
}

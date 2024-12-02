public class Program {
    public static void main(String[] args) {
        Bus bus = new Bus("Arivva", "RouteMaster", 2022, 70, 2000, "Blue", true, 45);
        System.out.println(bus.displayDetails());
        bus.start();
        bus.refuel();
        System.out.println(bus.getLastServiceDate());
    }
}

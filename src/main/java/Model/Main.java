package Model;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a valid vehicle object
            Vehicle vehicle1 = new Vehicle("V123", "Toyota", "Camry", 2022, 55.99);
            System.out.println(vehicle1);

            // Attempting to create an invalid vehicle (uncomment to test validation)
            // Vehicle invalidVehicle = new Vehicle("", "Ford", "Mustang", 1800, -10);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package creational.factory;

import java.util.Scanner;

public class FactoryClient {
    public static void main(String[] args) {
        // Initialize the factory
        VehicleFactory factory = new VehicleFactory();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the type of vehicle to create
        System.out.println("Enter the type of vehicle to create (car/bike): ");
        String vehicleType = scanner.nextLine().toLowerCase();

        // Create the vehicle based on user input
        Vehicle vehicle = factory.createVehicle(vehicleType);

        // If vehicle type is valid, create it
        if (vehicle != null) {
            vehicle.create();
        } else {
            System.out.println("Invalid vehicle type.");
        }

        // Close the scanner
        scanner.close();
    }
}

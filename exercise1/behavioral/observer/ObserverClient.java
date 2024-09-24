package behavioral.observer;

import java.util.Scanner;

public class ObserverClient {
    public static void main(String[] args) {
        // Initialize WeatherStation and Displays
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        DesktopDisplay desktopDisplay = new DesktopDisplay();

        // Add observers to the station
        station.addObserver(phoneDisplay);
        station.addObserver(desktopDisplay);

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Loop for user to set temperature
        while (true) {
            // Ask for user input
            System.out.println("Enter a new temperature (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Try to parse the temperature value
            try {
                int temperature = Integer.parseInt(input);
                // Update the temperature at the station, notifying observers
                station.setTemperature(temperature);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
            }
        }

        // Close scanner
        scanner.close();
    }
}

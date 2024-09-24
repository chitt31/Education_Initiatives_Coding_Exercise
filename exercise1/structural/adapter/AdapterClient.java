package structural.adapter;

import java.util.Scanner;

public class AdapterClient {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user whether they want to use the US plug
        System.out.println("Do you want to use the US plug adapter? (yes/no)");
        String input = scanner.nextLine().toLowerCase();

        // Check user input and proceed accordingly
        if (input.equals("yes")) {
            // Initialize US plug and adapter
            USPlug usPlug = new USPlug();
            Socket adapter = new USPlugAdapter(usPlug);

            // Provide power through the adapter
            adapter.providePower();
        } else {
            System.out.println("No adapter used.");
        }

        // Close scanner
        scanner.close();
    }
}

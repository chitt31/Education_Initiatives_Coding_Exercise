package behavioral.strategy;

import java.util.Scanner;

public class PaymentClient {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = null;

        while (true) {
            // Ask user to select a payment method
            System.out.println("Select payment method (creditcard/paypal). Type 'exit' to quit:");
            String paymentMethod = scanner.nextLine().toLowerCase();

            if (paymentMethod.equals("exit")) {
                break; // Exit the loop if the user types 'exit'
            }

            // Set the appropriate payment method in the context
            switch (paymentMethod) {
                case "creditcard":
                    context = new PaymentContext(new CreditCardPayment());
                    break;
                case "paypal":
                    context = new PaymentContext(new PayPalPayment());
                    break;
                default:
                    System.out.println("Invalid payment method. Please enter 'creditcard' or 'paypal'.");
                    continue; // Continue to the next iteration for valid input
            }

            // Ask user for the payment amount
            System.out.println("Enter the payment amount: ");
            try {
                int amount = Integer.parseInt(scanner.nextLine());
                // Make the payment
                context.makePayment(amount);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a valid number.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

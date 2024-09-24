package structural.decorator;

import java.util.Scanner;

public class DecoratorClient {
    public static void main(String[] args) {
        // Initialize a basic pizza
        Pizza pizza = new BasicPizza();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // User instructions
        System.out.println("Welcome to the Pizza Shop!");
        System.out.println("Base: Basic Pizza ($5)");
        System.out.println("Available toppings: Cheese (+$1), Pepperoni (+$2)");
        System.out.println("Enter 'done' when you are finished adding toppings.");

        // Loop to add toppings based on user input
        while (true) {
            System.out.print("Choose a topping (cheese/pepperoni) or type 'done': ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("done")) {
                break;
            }

            // Add toppings based on user input
            switch (input) {
                case "cheese":
                    pizza = new Cheese(pizza);
                    System.out.println("Added Cheese.");
                    break;
                case "pepperoni":
                    pizza = new Pepperoni(pizza);
                    System.out.println("Added Pepperoni.");
                    break;
                default:
                    System.out.println("Invalid topping. Please choose 'cheese' or 'pepperoni'.");
                    break;
            }
        }

        // Final pizza description and total cost
        System.out.println("Your pizza: " + pizza.getDescription());
        System.out.println("Total Cost: $" + pizza.getCost());

        // Close scanner
        scanner.close();
    }
}

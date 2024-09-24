package main;
import commands.Command;
import commands.MoveCommand;
import commands.TurnLeftCommand;
import commands.TurnRightCommand;
import grid.Grid;
import grid.Obstacle;
import java.util.Scanner;
import rover.Direction;
import rover.Rover;

public class Main {
    public static void main(String[] args) {
        // Grid setup (10x10)
        Grid grid = new Grid(10, 10);
        grid.addElement(2, 2, new Obstacle());
        grid.addElement(3, 5, new Obstacle());

        // Initialize Rover
        Rover rover = new Rover(0, 0, Direction.N, grid);

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // User instructions
        System.out.println("Enter commands for the Rover (move, turnleft, turnright). Type 'exit' to stop:");
        
        while (true) {
            // Take user input
            System.out.print("Command: ");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("exit")) {
                break;
            }

            // Create corresponding command based on user input
            Command command = null;
            switch (input) {
                case "move":
                    command = new MoveCommand(rover);
                    break;
                case "turnleft":
                    command = new TurnLeftCommand(rover);
                    break;
                case "turnright":
                    command = new TurnRightCommand(rover);
                    break;
                default:
                    System.out.println("Invalid command. Please enter 'move', 'turnleft', or 'turnright'.");
                    continue;
            }

            // Execute the command
            command.execute();
            System.out.println(rover.getStatus());
        }

        // Final rover status
        System.out.println("Final Rover Status: " + rover.getStatus());
        
        // Close scanner
        scanner.close();
    }
}

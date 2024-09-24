package commands;

import rover.Rover;

public class MoveCommand implements Command{
    private final Rover rover;
    public MoveCommand(rover.Rover rover) {
        this.rover = rover;

    }
    @Override
    public void execute(){
        rover.move();
    }
    
}

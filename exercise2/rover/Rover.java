package rover;

import grid.Grid;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private final Grid grid;

    public Rover(int startX, int startY, Direction startDirection, Grid grid) {
        this.x = startX;
        this.y = startY;
        this.direction = startDirection;
        this.grid = grid;
    }

    public void move() {
        int newX = x;
        int newY = y;

        switch (direction) {
            case N: newY += 1; break;
            case E: newX += 1; break;
            case S: newY -= 1; break;
            case W: newX -= 1; break;
        }

        if (grid.isWithinBounds(newX, newY) && !grid.isObstacle(newX, newY)) {
            x = newX;
            y = newY;
        } else {
            System.out.println("Movement blocked. Obstacle or out of bounds.");
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String getStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction;
    }
}

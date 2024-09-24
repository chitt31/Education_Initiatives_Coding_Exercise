package grid;

public class Obstacle implements CompositeGridElement{
    @Override 
    public boolean isObstacle() {
        return true;
    }
}

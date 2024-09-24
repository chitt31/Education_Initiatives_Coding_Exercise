package grid;
import java.util.HashMap;
import java.util.Map;
public class Grid {
    private final int width;
    private final int height ;
    private final Map<String,CompositeGridElement> elements;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.elements = new HashMap<>(); 
    }
    public void addElement(int x, int y, CompositeGridElement element) {
        elements.put(x + ":" + y, element);
    }
    public boolean isObstacle(int x, int y){
        CompositeGridElement element = elements.get(x + ":" + y);
        return element != null && element.isObstacle();
    }
    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}

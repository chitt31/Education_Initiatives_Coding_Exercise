package behavioral.observer;

public class DesktopDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Desktop Display: Temperature updated to " + temperature + "°C.");
    }
}

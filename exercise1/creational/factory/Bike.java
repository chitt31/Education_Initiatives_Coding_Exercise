package creational.factory;

public class Bike implements Vehicle {
    @Override
    public void create() {
        System.out.println("Bike created!");
    }
}

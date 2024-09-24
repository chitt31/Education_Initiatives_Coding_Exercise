package creational.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1 == db2);  // True, same instance

        db1.connect();
    }
}

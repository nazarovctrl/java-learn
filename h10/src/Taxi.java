import driver.Driver;
import factory.TaxiFactory;
import move.Move;

//Client
public class Taxi {
    private Driver driver;
    private Move move;

    public Taxi(TaxiFactory taxiFactory) {
        driver = taxiFactory.createDrive();
        move = taxiFactory.createMove();
    }

    public void run() {
        driver.drive();
        move.move();
    }
}

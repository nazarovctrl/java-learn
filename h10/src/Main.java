import factory.MotoTaxiFactory;
import factory.TrackTaxiFactory;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(new TrackTaxiFactory());
        taxi.run();

        taxi = new Taxi(new MotoTaxiFactory());
        taxi.run();
    }
}

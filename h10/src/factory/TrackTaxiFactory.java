package factory;

import driver.Driver;
import driver.TruckDriver;
import move.Ride;
import move.Move;

public class TrackTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDrive() {
        return new TruckDriver();
    }

    @Override
    public Move createMove() {
        return new Ride();
    }
}

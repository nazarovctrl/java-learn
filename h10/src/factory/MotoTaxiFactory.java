package factory;

import driver.Biker;
import driver.Driver;
import move.Move;
import move.Rush;

public class MotoTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDrive() {
        return new Biker();
    }

    @Override
    public Move createMove() {
        return new Rush();
    }
}

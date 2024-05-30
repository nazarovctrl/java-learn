package factory;

import driver.Driver;
import move.Move;

public interface TaxiFactory {
    Driver createDrive();

    Move createMove();
}

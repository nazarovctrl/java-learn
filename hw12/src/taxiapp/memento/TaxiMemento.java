package taxiapp.memento;

import taxiapp.tariff.ITariff;

public class TaxiMemento {
    private final String driver;
    private final int mileage;
    private final String state;

    public TaxiMemento(String driver, int mileage, ITariff tariff, String state) {
        this.driver = driver;
        this.mileage = mileage;
        this.state = state;
    }

    public int getMileage() {
        return mileage;
    }

    public String getDriver() {
        return driver;
    }

    public String getState() {
        return state;
    }
}

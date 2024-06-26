package taxiapp.memento;

import taxiapp.Taxi;

public class CareTaker {
    private TaxiMemento taxiMemento;

    public void saveState(Taxi taxi) {
        taxiMemento = taxi.saveState();
    }

    public void restoreState(Taxi taxi) {
        taxi.restoreState(taxiMemento);
    }
}

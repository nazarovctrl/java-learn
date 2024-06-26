package taxiapp;

import taxiapp.memento.TaxiMemento;
import taxiapp.state.*;
import taxiapp.tariff.ITariff;
import taxiapp.visitor.IElement;
import taxiapp.visitor.IVisitor;

public class Taxi implements IElement {
    private String driver;
    private int mileage;
    private ITariff tariff;
    private ITaxiState state;

    public Taxi(String driver, ITariff tariff) {
        this.driver = driver;
        this.tariff = tariff;
        state = new StopState();
    }

    public void calculate() {
        tariff.calculate(mileage);
    }

    public void setTariff(ITariff tariff) {
        this.tariff = tariff;
    }

    public void start() {
        state.start(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void accelerate() {
        state.accelerate(this);
    }

    public void setState(ITaxiState state) {
        this.state = state;
    }

    public String getStatenName() {
        return state.getStateName();
    }

    public TaxiMemento saveState() {
        return new TaxiMemento(driver, mileage, tariff, state.getStateName());
    }

    public void restoreState(TaxiMemento memento) {
        this.mileage = memento.getMileage();
        this.driver = memento.getDriver();
        TaxiState taxiState = TaxiState.valueOf(memento.getState());
        state = switch (taxiState) {
            case STOP -> new StopState();
            case START -> new StartState();
            case ACCELERATE -> new AccelerateState();
        };
    }

    public ITariff getTariff() {
        return tariff;
    }

    public String getDriver() {
        return driver;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

package taxiapp.state;

import taxiapp.Taxi;

public class AccelerateState implements ITaxiState {
    @Override
    public void start(Taxi taxi) {
        System.out.println("Taxi is already starting");
    }

    @Override
    public void stop(Taxi taxi) {
        System.out.println("Taxi is stopping");
        taxi.setState(new StopState());
    }

    @Override
    public void accelerate(Taxi taxi) {
        System.out.println("Taxi is already accelerating");
    }

    @Override
    public String getStateName() {
        return TaxiState.ACCELERATE.name();
    }
}

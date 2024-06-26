package taxiapp.state;

import taxiapp.Taxi;

public class StopState implements ITaxiState {
    @Override
    public void start(Taxi taxi) {
        System.out.println("Taxi is starting");
        taxi.setState(new StartState());
    }

    @Override
    public void stop(Taxi taxi) {
        System.out.println("Taxi is already stopping");
    }

    @Override
    public void accelerate(Taxi taxi) {
        System.out.println("Standing Taxi can't accelerate");
    }

    @Override
    public String getStateName() {
        return TaxiState.STOP.name();
    }
}

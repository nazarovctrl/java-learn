package taxiapp.state;

import taxiapp.Taxi;

public interface ITaxiState {

    void start(Taxi taxi);
    void stop(Taxi taxi);
    void accelerate(Taxi taxi);

    String getStateName();
}

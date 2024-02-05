package builder;

import utils.Engine;
import utils.GPS;
import utils.TripComputer;

public class CarBuilder implements Builder {

    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarBuilder setGPS(GPS gps) {
        this.gps = gps;
        return this;
    }

    @Override
    public Car build() {
        return new Car(seats, engine, tripComputer, gps);
    }
}

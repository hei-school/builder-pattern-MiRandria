package builder;

import utils.Engine;
import utils.GPS;
import utils.TripComputer;

public class Car {

    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    public Car(int seats, Engine engine, TripComputer tripComputer, GPS gps) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPS getGps() {
        return gps;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }
}

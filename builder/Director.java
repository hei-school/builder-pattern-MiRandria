package builder;

import utils.SUVEngine;
import utils.SportEngine;

public class Director {

    public void makeSportsCar(CarBuilder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSUV(CarBuilder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new SUVEngine());
        builder.setTripComputer();
        builder.setGPS();
    }
}


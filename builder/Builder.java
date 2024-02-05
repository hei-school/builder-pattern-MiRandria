package builder;

import utils.Engine;
import utils.GPS;
import utils.TripComputer;

public interface Builder {
    CarBuilder setSeats(int seats);

    CarBuilder setEngine(Engine engine);

    CarBuilder setTripComputer(TripComputer tripComputer);

    CarBuilder setGPS(GPS gps);

    Car build();
}

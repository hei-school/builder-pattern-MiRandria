package unitTest;

import builder.Car;
import builder.CarBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import utils.Engine;
import utils.GPS;
import utils.TripComputer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CarBuilderTest {

    @Mock
    private Engine engine;

    @Mock
    private TripComputer tripComputer;

    @Mock
    private GPS gps;

    @Test
    public void shouldSetAndGetSeats() {
        int expectedSeats = 5;
        CarBuilder builder = new CarBuilder();
        builder.setSeats(expectedSeats);

        assertEquals(expectedSeats, builder.getSeats());
    }

    @Test
    public void shouldSetAndGetEngine() {
        CarBuilder builder = new CarBuilder();
        builder.setEngine(engine);

        assertEquals(engine, builder.getEngine());
    }

    @Test
    public void shouldSetAndGetTripComputer() {
        CarBuilder builder = new CarBuilder();
        builder.setTripComputer(tripComputer);

        assertEquals(tripComputer, builder.getTripComputer());
    }

    @Test
    public void shouldSetAndGetGPS() {
        CarBuilder builder = new CarBuilder();
        builder.setGPS(gps);

        assertEquals(gps, builder.getGPS());
    }

    @Test
    public void shouldBuildACarWithConfiguredProperties() {
        int seats = 5;
        CarBuilder builder = new CarBuilder()
                .setSeats(seats)
                .setEngine(engine)
                .setTripComputer(tripComputer)
                .setGPS(gps);

        Car car = builder.build();

        assertEquals(seats, car.getSeats());
        assertEquals(engine, car.getEngine());
        assertEquals(tripComputer, car.getTripComputer());
        assertEquals(gps, car.getGps());
    }
}


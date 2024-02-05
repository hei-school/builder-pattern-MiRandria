package unitTest;

import builder.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import utils.Engine;
import utils.GPS;
import utils.TripComputer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    @Mock
    private Engine engine;

    @Mock
    private TripComputer tripComputer;

    @Mock
    private GPS gps;

    @Test
    public void shouldCreateACarWithGivenSeatsEngineTripComputerAndGPS() {
        int seats = 5;
        Car car = new Car(seats, engine, tripComputer, gps);

        assertEquals(seats, car.getSeats());
        assertEquals(engine, car.getEngine());
        assertEquals(tripComputer, car.getTripComputer());
        assertEquals(gps, car.getGps());
    }

    @Test
    public void shouldSetAndGetSeats() {
        int initialSeats = 5;
        int newSeats = 7;
        Car car = new Car(initialSeats, engine, tripComputer, gps);

        car.setSeats(newSeats);

        assertEquals(newSeats, car.getSeats());
    }

    @Test
    public void shouldStartEngineWhenCarStarts() {
        Car car = new Car(4, engine, tripComputer, gps);

        car.start();

        verify(engine).start();
    }

    @Test
    public void shouldGetFuelLevelFromEngine() {
        when(engine.getFuelLevel()).thenReturn(0.75);
        Car car = new Car(4, engine, tripComputer, gps);

        double fuelLevel = car.getFuelLevel();

        assertEquals(0.75, fuelLevel, 0.0);
    }
}


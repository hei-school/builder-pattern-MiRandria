package unitTest;

import builder.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarManualBuilderTest {

    @Mock
    private Car car;

    @Test
    public void shouldBuildCarManualWithCorrectInformation() {
        when(car.getClass().getSimpleName()).thenReturn("SportCar");
        when(car.getSeats()).thenReturn(2);
        when(car.getEngine().getClass().getSimpleName()).thenReturn("SportEngine");

        CarManualBuilder builder = new CarManualBuilder(car);
        String manual = builder.build();

        assertEquals(
                "**Manuel d'utilisation de la voiture**\n" +
                        "Modèle: SportCar\n" +
                        "Nombre de places: 2\n" +
                        "Moteur: SportEngine\n", manual);
    }
}


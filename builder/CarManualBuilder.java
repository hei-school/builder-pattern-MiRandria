package builder;

public class CarManualBuilder {

    private Car car;

    public CarManualBuilder(Car car) {
        this.car = car;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append("**Manuel d'utilisation de la voiture**\n");
        sb.append("Modèle: ").append(car.getClass().getSimpleName()).append("\n");
        sb.append("Nombre de places: ").append(car.getSeats()).append("\n");
        sb.append("Moteur: ").append(car.getEngine().getClass().getSimpleName()).append("\n");

        return sb.toString();
    }
}

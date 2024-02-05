package utils;

public class TripComputer {

    private int distanceTraveled;
    private int averageSpeed;

    public TripComputer() {
        this.distanceTraveled = 0;
        this.averageSpeed = 0;
    }

    public void addDistance(int distance) {
        this.distanceTraveled += distance;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }
}

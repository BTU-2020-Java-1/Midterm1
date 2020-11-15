package ge.edu.btu.midterm.oop;

public class Bus extends Vehicle {

    private int stationsNumber;

    private double stopTime;

    public Bus() {
    }

    public Bus(String code, double distance, double averageSpeed, int stationsNumber, double stopTime) {
        super(code, distance, averageSpeed);
        this.stationsNumber = stationsNumber;
        this.stopTime = stopTime;
    }

    public int getStationsNumber() {
        return stationsNumber;
    }

    public void setStationsNumber(int stationsNumber) {
        this.stationsNumber = stationsNumber;
    }

    public double getStopTime() {
        return stopTime;
    }

    public void setStopTime(double stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public double getTime() {
        return getDistance() / getAverageSpeed() + getStopTime() * getStationsNumber();
    }
}

package ge.edu.btu.midterm.oop;

public class Train extends Vehicle {

    private double blockingCoefficient;

    public Train() {
    }

    public Train(String code, double distance, double averageSpeed, double blockingCoefficient) {
        super(code, distance, averageSpeed);
        this.blockingCoefficient = blockingCoefficient;
    }

    public double getBlockingCoefficient() {
        return blockingCoefficient;
    }

    public void setBlockingCoefficient(double blockingCoefficient) {
        this.blockingCoefficient = blockingCoefficient;
    }

    @Override
    public double getTime() {
        return getDistance() / getAverageSpeed() + getBlockingCoefficient();
    }
}

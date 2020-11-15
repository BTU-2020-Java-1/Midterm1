package ge.edu.btu.midterm.iostreams;

import java.io.Serializable;

public class Movie implements Serializable {

    private long id;

    private String name;

    private int pointsNumber;

    private int pointsSum;

    public Movie() {
    }

    public Movie(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPoint(int point) {
        pointsNumber++;
        pointsSum += point;
    }

    public double getAveragePoint() {
        return (double) pointsSum / pointsNumber;
    }

    @Override
    public String toString() {
        return name + ": " + getAveragePoint();
    }
}

package ge.edu.btu.midterm.oop;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Bus bus = new Bus("4264", 550, 50, 21, 2);
        Train train = new Train("1251", 1000, 60, 25);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bus);
        vehicles.add(train);

        try {
            validateVehicles(vehicles);
        } catch (VehicleException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა: " + ex.getMessage());
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    private static void validateVehicles(List<Vehicle> vehicles) throws VehicleException {
        for (int i = 0; i < vehicles.size(); i++) {
            for (int j = i + 1; j < vehicles.size(); j++) {
                if (vehicles.get(i).getCode().equals(vehicles.get(j).getCode())) {
                    throw new VehicleException("Duplicate code");
                }
            }
        }
    }
}

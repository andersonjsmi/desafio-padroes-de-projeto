package me.dio;

import java.util.ArrayList;
import java.util.List;

public class Battle {
    private static Battle battle = new Battle();
    private List<Vehicle> vehicles;

    private Battle () {
        super();
        vehicles = new ArrayList<>();
    }

    public static Battle getInstance(){
        return battle;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void update(){
        vehicles.forEach(vehicle -> {
            vehicles.forEach(detectVehicles -> {
                vehicle.strategy.detectObject(vehicle, detectVehicles);
            });
        });
    }
}

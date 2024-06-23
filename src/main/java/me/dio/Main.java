package me.dio;

public class Main {
    public static void main(String[] args) {
        Battle battle = Battle.getInstance();

        Vehicle vehicle;
        // Adiciona veiculos
        for (int cx = 0; cx < 10; cx++) {
            vehicle = new Tank();
            vehicle.setStrategy(CombatStrategy.getInstance());
            vehicle.setCondition(100);
            vehicle.setTeam(Team.ALLIED);
            battle.addVehicle(vehicle);
        }

        for (int cx = 0; cx < 10; cx++) {
            vehicle = new Fighter();
            vehicle.setStrategy(CombatStrategy.getInstance());
            vehicle.setCondition(100);
            vehicle.setTeam(Team.ALLIED);
            battle.addVehicle(vehicle);
        }

        for (int cx = 0; cx < 10; cx++) {
            vehicle = new Tank();
            vehicle.setStrategy(CombatStrategy.getInstance());
            vehicle.setCondition(100);
            vehicle.setTeam(Team.ENEMY);
            battle.addVehicle(vehicle);
        }

        for (int cx = 0; cx < 10; cx++) {
            vehicle = new Fighter();
            vehicle.setStrategy(CombatStrategy.getInstance());
            vehicle.setCondition(100);
            vehicle.setTeam(Team.ENEMY);
            battle.addVehicle(vehicle);
        }

        for (int cx = 0; cx < 3; cx++) {
            vehicle = new Fighter();
            vehicle.setStrategy(CombatStrategy.getInstance());
            vehicle.setCondition(100);
            vehicle.setTeam(Team.UNKNOWN);
            battle.addVehicle(vehicle);
        }

        // executa 100 turnos de batalha
        for (int cx = 0; cx < 10; cx++) {
            battle.update();
        }
    }

}
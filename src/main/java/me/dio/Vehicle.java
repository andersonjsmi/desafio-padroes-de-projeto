package me.dio;

public abstract class Vehicle {
    protected FighterStrategy strategy; // Estrategia de voo
    protected Team team; // Time da aeronave
    protected int condition = 100; //Condição da aeronave

    public Team getTeam() {
        return team;
    }

    public int getCondition() {
        return condition;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public FighterStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(FighterStrategy strategy) {
        this.strategy = strategy;
    }

    public void isAttacked (Vehicle attacker) {
        strategy.detectAggression(this, attacker);
    }

    public abstract void intercept (Vehicle vehicle);

    public void attack (Vehicle vehicle){
        vehicle.isAttacked(this);
        System.out.println("Atacando objeto" + vehicle);
    }

    public abstract void escape ();
}

package me.dio;

public interface FighterStrategy {

    // O caça detectou um objeto no espaço aéreo
    public void detectObject(Vehicle object,Vehicle objectDetect);

    // O caça foi atacado por um objeto
    public void detectAggression(Vehicle object,Vehicle objectDetect);

    // O objeto detectado/agressor esta fugindo
    public void detectLeak(Vehicle object,Vehicle objectDetect);

}

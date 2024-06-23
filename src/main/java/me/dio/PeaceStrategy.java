package me.dio;

public class PeaceStrategy implements FighterStrategy{
    @Override
    public void detectObject(Vehicle object, Vehicle objectDetect) {
        // Intercepta o objeto inimigo em caso de detecção
        if (objectDetect.getTeam() == Team.ENEMY) {
            object.intercept(objectDetect);
        }
    }

    @Override
    public void detectAggression(Vehicle object, Vehicle objectDetect) {
        // Fugir da agressão
        object.escape();
    }

    @Override
    public void detectLeak(Vehicle object, Vehicle objectDetect) {
        // não executa nenhuma ação em casos de fuga do objeto detectado
    }
}

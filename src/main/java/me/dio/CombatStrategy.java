package me.dio;

public class CombatStrategy implements FighterStrategy{

    private static FighterStrategy strategy = new CombatStrategy();

    private CombatStrategy () {};

    @Override
    public void detectObject(Vehicle object, Vehicle objectDetect) {
        if(objectDetect.getTeam() != object.getTeam()){
            //objeto inimigo detectado
            if (object.getCondition() > 60)
                // ataca o objeto inimigo caso esteja acima de 60% de condição
                object.attack(objectDetect);
            else
                //objeto inimigo detectado
                object.escape();
        } else if (objectDetect.getTeam() == Team.UNKNOWN) {
            object.intercept(objectDetect); // intercepta o objeto caso seja desconhecido
        }
    }

    @Override
    public void detectAggression(Vehicle object, Vehicle objectDetect) {
        // ataca o inimigo
        System.out.println(object + " sob ataque! Contra atacando!");
    }

    @Override
    public void detectLeak(Vehicle object, Vehicle objectDetect) {
        // Intercepta o objeto em caso de fuga
        if(objectDetect.getTeam() != object.getTeam()) {
            if(object.getCondition() == 100)
                object.intercept(objectDetect);
            // Se avariado iniciar retirada
            else
                object.escape();

        }
    }


    public static FighterStrategy getInstance() {
        return strategy;
    }


}

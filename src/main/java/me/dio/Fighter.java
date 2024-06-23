package me.dio;

public class Fighter extends Vehicle {


    @Override
    public void intercept(Vehicle vehicle) {
        System.out.println("Pronto para atacar " + vehicle);
    }


    @Override
    public void escape() {
        System.out.println("Escapando do campo de batalha");
    }
}

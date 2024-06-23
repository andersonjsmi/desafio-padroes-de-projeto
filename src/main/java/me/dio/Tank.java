package me.dio;

public class Tank extends Vehicle{

    public void intercept (Vehicle vehicle) {
        System.out.println("Apontando canhão para o objeto " + vehicle);
    }


    public void escape () {
        System.out.println("Saindo do perimetro");
    }
}

package com.mycompany.sistemavehiculo;

public class Carro extends Vehiculo {

    public Carro(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    public void acelerar() {
        System.out.println("El carro acelera rapidamente");
    }

    public void frenar() {
        System.out.println("El carro frena ");
    }
}

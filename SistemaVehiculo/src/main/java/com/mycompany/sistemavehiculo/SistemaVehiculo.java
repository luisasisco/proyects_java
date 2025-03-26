/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavehiculo;

/**
 *
 * @author LuisaRuiz
 */
public class SistemaVehiculo {

    public static void main(String[] args) {
        Vehiculo[]vehiculos={
            new Carro("Toyota", "Corolla",2022),
            new Moto("Yamaha", "yzf",2014),
            new Bicicleta("Giant", "escape 3",2023),
        };
        for(Vehiculo v:vehiculos){
            v.mostrarInfo();
            v.acelerar();
            v.frenar();
            System.out.println("--------------");
        }
    }
}

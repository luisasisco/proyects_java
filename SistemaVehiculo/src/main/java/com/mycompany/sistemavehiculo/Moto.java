/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculo;

/**
 *
 * @author LuisaRuiz
 */
public class Moto extends Vehiculo{

    public Moto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
     public void acelerar() {
        System.out.println("la moto acelera con rapidez ");
    }
       public void frenar() {
        System.out.println("la moto frena ");
    }  

    
}

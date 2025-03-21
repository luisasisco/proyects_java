package com.mycompany.ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LuisaRuiz
 */
public class VerificarNumero {

    public static void VerificarNumero(int numero) {
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo");
        }else{
            System.out.println("El numero es cero");
        }
    }
}

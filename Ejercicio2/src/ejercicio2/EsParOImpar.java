package ejercicio2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LuisaRuiz
 */
public class EsParOImpar {

    public static void EsParOImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero, por favor ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero" + numero + "es par");
        }else{
            System.out.println("El numero" + numero + "es impar");
        }
    }

}

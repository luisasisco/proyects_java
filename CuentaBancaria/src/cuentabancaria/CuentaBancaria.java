/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author LuisaRuiz
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bancaria lacuenta = new Bancaria(50.000);

        lacuenta.mostrarSaldo();
        lacuenta.depositar(800);
        lacuenta.mostrarSaldo();
    }

}

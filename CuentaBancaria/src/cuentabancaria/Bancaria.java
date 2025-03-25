/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author LuisaRuiz
 */
public class Bancaria {

    private double saldo;

    public Bancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso : $" + monto);

        } else {
            System.out.println("El monto a depositar debe ser mayor a cero ");
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo actual: $" + saldo);
    }
}

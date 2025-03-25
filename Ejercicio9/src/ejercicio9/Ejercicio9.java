/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaBancaria("206", 15000));
        cuentas.add(new CuentaBancaria("203", 19000));

        double saldoTotal = calcularSaldoTotal(cuentas);
        System.out.println("El saldo total de todas las cuentas es : $" + saldoTotal);
    }

    public static double calcularSaldoTotal(List<CuentaBancaria> cuentas) {
        double total = 0;

        for (CuentaBancaria cuenta : cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

}

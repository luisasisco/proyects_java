/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(new CuentaBancaria("1596", 500));
        cuentas.add(new CuentaBancaria("8523", 1200));
        cuentas.add(new CuentaBancaria("7896", 700));
        cuentas.add(new CuentaBancaria("45236", 850));

        double saldoTotal = calcularSaldoTotal(cuentas);
        System.out.println("El saldo total de todas las cuentas es: $" + saldoTotal);
    }

    public static double calcularSaldoTotal(List<CuentaBancaria> cuentas) {
        double saldoTotal = 0;
        int i = 0;

        do {
            saldoTotal += cuentas.get(i).getSaldo();
            i++;
        } while (i < cuentas.size());
        return saldoTotal;
    }
}

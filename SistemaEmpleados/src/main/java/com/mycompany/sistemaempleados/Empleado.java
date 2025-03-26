package com.mycompany.sistemaempleados;

public class Empleado {

    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " salario: 0" + calcularSalario());
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

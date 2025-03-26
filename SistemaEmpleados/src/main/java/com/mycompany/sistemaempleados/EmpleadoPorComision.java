package com.mycompany.sistemaempleados;

public class EmpleadoPorComision extends Empleado {

    private double ventas;
    private double comision;

    public EmpleadoPorComision(double ventas, double comision, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.comision = comision;
    }

    public double calcularSalario() {
        return getSalarioBase() + (ventas * comision);
    }
}

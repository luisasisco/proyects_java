package com.mycompany.sistemaempleados;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase();
    }
}

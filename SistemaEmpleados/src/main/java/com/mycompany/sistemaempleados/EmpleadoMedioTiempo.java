package com.mycompany.sistemaempleados;

public class EmpleadoMedioTiempo extends Empleado {

    public EmpleadoMedioTiempo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase();
    }
}

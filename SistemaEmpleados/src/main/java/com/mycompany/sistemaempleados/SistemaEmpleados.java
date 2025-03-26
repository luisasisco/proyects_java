package com.mycompany.sistemaempleados;

public class SistemaEmpleados {

    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoTiempoCompleto("Carlos", 3000),
            new EmpleadoTiempoCompleto("Antonia", 1400),
            new EmpleadoTiempoCompleto("Ana", 20000)
        };
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }
}

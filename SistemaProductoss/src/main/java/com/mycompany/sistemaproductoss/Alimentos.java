package com.mycompany.sistemaproductoss;

import java.math.BigDecimal;

public class Alimentos extends Producto {

    private String fechaVencimiento;
    private String unidadMedida;

    public Alimentos(String fechaVencimiento, String unidadMedida, String name, String state, int code, BigDecimal price) {
        super(name, state, code, price);
        this.fechaVencimiento = fechaVencimiento;
        this.unidadMedida = unidadMedida;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

}

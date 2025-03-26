package com.mycompany.sistemaproductoss;

import java.math.BigDecimal;

public class Electronico extends Producto {

    private String marca;
    private int garantia;

    public Electronico(String marca, int garantia, String name, String state, int code, BigDecimal price) {
        super(name, state, code, price);
        this.marca = marca;
        this.garantia = garantia;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

}

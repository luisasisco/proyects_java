package com.mycompany.sistemaproductoss;

import java.math.BigDecimal;

public class Ropa extends Producto {

    private String talla;
    private String material;

    public Ropa(String talla, String material, String name, String state, int code, BigDecimal price) {
        super(name, state, code, price);
        this.talla = talla;
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}

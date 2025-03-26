package com.mycompany.sistemaproductos;

import java.math.BigDecimal;

public class Producto implements Iproducto {

    private String name;
    private int code;
    private String state;
    private BigDecimal price;

    public Producto(String name, int code, String state, BigDecimal price) {
        this.name = name;
        this.code = code;
        this.state = state;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    
    
    
}


    

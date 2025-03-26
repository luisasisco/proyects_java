package com.mycompany.sistemaproductoss;

import java.math.BigDecimal;

public class Producto implements IProducto {

    private String name;
    private String state;
    private int code;
    private BigDecimal price;

    public Producto(String name, String state, int code, BigDecimal price) {
        this.name = name;
        this.state = state;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal getprice() {
        return this.price;
    }

    @Override
    public int getcode() {
        return this.code;
    }

    @Override
    public String getstate() {
        return this.state;
    }

    @Override
    public String getname() {
        return this.name;
    }
    
    public String mostrarInfo(){
        return "Nombre: "+name+" | codigo: "+code+" | Precio: "+price;
    }

}

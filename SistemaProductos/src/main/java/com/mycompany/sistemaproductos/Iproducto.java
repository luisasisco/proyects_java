/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaproductos;

import java.math.BigDecimal;

/**
 *
 * @author LuisaRuiz
 */
public interface Iproducto  {
    BigDecimal getPrice();
    String getName();
    Integer getCode();
    String getState();
    
}

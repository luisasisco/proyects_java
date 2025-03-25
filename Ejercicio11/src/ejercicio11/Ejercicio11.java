/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Lapto", 1300));
        productos.add(new Producto("USB", 15));
        productos.add(new Producto("Mouse", 60000));

        mostrarProductosCaros(productos);
    }

    public static void mostrarProductosCaros(List<Producto> productos) {
        System.out.println("Productos con precio mayor a 50");

        for (Producto producto : productos) {
            if (producto.getPrecio() > 50) {
                System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
            }
        }
    }

}

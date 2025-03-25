/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public class ListaProductos {
    }

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Celular", 1500));
        productos.add(new Producto("Auriculares", 1900));
        productos.add(new Producto("Tablet", 2000));

        mostrarProductos(productos);
    }

    public static void mostrarProductos(List<Producto> productos) {
        System.out.println("Esta es la lista de productos:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + " - Precio: $" + producto.getPrecio());
        }
    }

}

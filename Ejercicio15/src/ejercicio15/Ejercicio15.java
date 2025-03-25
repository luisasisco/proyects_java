/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("IT", "Stephen King"));
        libros.add(new Libro("Yo", "Autor Famoso"));
        libros.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez"));

        procesarLibros(libros);
    }

    public static void procesarLibros(List<Libro> libros) {
        System.out.println("Lista de libros actualizados");

        for (Libro libro : libros) {
            if (libro.getTitulo().length() < 5) {
                libro.setAutor("Desconocido");
            }
            System.out.println("Titulo: " + libro.getTitulo() + " | Autor: " + libro.getAutor());
        }
    }

}

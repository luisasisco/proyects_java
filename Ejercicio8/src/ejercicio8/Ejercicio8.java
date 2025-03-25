/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        libros.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez"));
        libros.add(new Libro("La amiga estupenda", "Ferrante Elena"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro: ");
        String tituloBuscado = scanner.nextLine();

        buscarLibro(libros, tituloBuscado);
    }

    public static void buscarLibro(List<Libro> libros, String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encntrado: " + libro.getTitulo() + " - Autor: " + libro.getAutor());
                return;
            }
        }
        System.out.println("El libro no se encuentra en la lista.");
    }

}

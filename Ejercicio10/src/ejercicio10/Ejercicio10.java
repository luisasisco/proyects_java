/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Antonia", 15));
        personas.add(new Persona("Rafael", 10));

        cambiarNombre(personas, "Rafael", "Samuel");

        System.out.println("Lista actualizada");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad() + "años");
        }

    }

    public static void cambiarNombre(List<Persona> personas, String nombreActual, String nuevoNombre) {
        boolean encontrado = false;
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombreActual)) {
                persona.setNombre(nuevoNombre);
                System.out.println("El nombre ha sido actualizado a: " + nuevoNombre);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("El nombre no esta en la lista");
        }

    }
}

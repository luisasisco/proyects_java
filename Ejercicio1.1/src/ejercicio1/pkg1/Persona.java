/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.pkg1;

/**
 *
 * @author LuisaRuiz
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }
    public void mostrardatos(){
            System.out.println("Nombre: "+ nombre);
            System.out.println("Edad : "+ edad);
    }
    
}

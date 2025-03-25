/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Antonia", 18));
        personas.add(new Persona("Rafael", 12));
        personas.add(new Persona("Samuel", 25));
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona que desea buscar: ");
        String nombreBuscado=scanner.nextLine();
        
        buscarPersona(personas,nombreBuscado);
    }
    public static void buscarPersona(List<Persona> personas, String nombreBuscado){
        int i = 0;
        boolean encontrada=false;
        
        while(i<personas.size()){
            if(personas.get(i).getNombre().equalsIgnoreCase(nombreBuscado)){
                System.out.println("Persona encontrada: "+personas.get(i).getNombre()+" tiene "+personas.get(i).getEdad()+" años. ");
                encontrada=true;
                break;
            }
            i++;
        }
        if(!encontrada){
            System.out.println("La persona no esta en la lista");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan",85));
        estudiantes.add(new Estudiante("Sofia",45));
        estudiantes.add(new Estudiante("Antonio",55));
        estudiantes.add(new Estudiante("Melisa",65));
        
        contarAprobados(estudiantes);
    }
    public static void contarAprobados(List<Estudiante> estudiantes){
        int aprobados =0;
        int i=0;
        
        while (i<estudiantes.size()){
            if(estudiantes.get(i).getCalificacion()>=50){
                aprobados++;
            }
            i++;
        }
        System.out.println("Total de estudiantes aprobados: "+aprobados);    }
    
}

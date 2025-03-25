package ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisaRuiz
 */
public class Ejercicio7 {

        public static void main(String[] args) {
            List<Estudiante> estudiantes = new ArrayList<>();

            estudiantes.add(new Estudiante("Diana", 70));
            estudiantes.add(new Estudiante("Emanuel", 50));
            estudiantes.add(new Estudiante("Antonia", 80));

            mostrarEstudiantesAprobados(estudiantes);
        }
        public static void mostrarEstudiantesAprobados(List<Estudiante> estudiantes) {
            System.out.println("Los estudiantes aprobados son:");
            boolean Aprobados = false;
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getCalificacion() >= 60) {
                    System.out.println("Nombre: " + estudiante.getNombre() + " -Calificacion:" + estudiante.getCalificacion());
                    Aprobados = true;
                }
            }
            if(!Aprobados){
                System.out.println("Ningun estudiante aprobo.");
            }
        }
    }


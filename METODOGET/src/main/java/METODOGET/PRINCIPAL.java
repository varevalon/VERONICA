/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOGET;

/**
 *
 * @author Veronica
 */
public class PRINCIPAL {
    public static void main(String[] args) {
    ALUMNO alumno = new ALUMNO ("VERONICA","AREVALO",41,2,"A","DISTANCIA");
    System.out.println("El Nombre del Alumno es: "+alumno.getNombre());
    System.out.println("El Apellido del Alumno es: "+alumno.getApellido());
    System.out.println("La Edad del Alumno es: "+alumno.getEdad());
    System.out.println("El Nivel del Alumno es: "+alumno.getNivel());
    System.out.println("El Paralelo del Alumno es: "+alumno.getParalelo());
    System.out.println("La Modalidad del Alumno es: "+alumno.getModalidad());
    
            }
}

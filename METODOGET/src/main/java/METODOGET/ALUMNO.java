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
public class ALUMNO {
    String Nombre;
    String Apellido;
    int Edad;
    int Nivel;
    String Paralelo;
    String Modalidad;
    //Constructor
    public ALUMNO(String Nombre, String Apellido, int Edad, int Nivel, String Paralelo, String Modalidad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Nivel = Nivel;
        this.Paralelo = Paralelo;
        this.Modalidad = Modalidad;
    }
    public void verDatos(){//METODO VER DATOS
        
    }
//Generar Metodo SET

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public void setParalelo(String Paralelo) {
        this.Paralelo = Paralelo;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }
//Generar Metodo GET    

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public int getNivel() {
        return Nivel;
    }

    public String getParalelo() {
        return Paralelo;
    }

    public String getModalidad() {
        return Modalidad;
    }
    
   
    
    
}

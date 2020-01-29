package PARAMETROS1;
/**
 *
 * @author Veronica
 */
public class AUTOMOVIL {//Creación de métoso y funciones.
    String marca;
    int velocidad_maxima;
    double valor;
    String color;
    
    
    public void enciende(String nombre) {//metodo tipo string enciende
        marca = "CHEVROLET";
        System.out.println("El vehiculo de marca "+ marca + nombre + " ,sin problema.");//imprime en consola
    }

    public void acelera(String nombre) {//metodo tipo string acelera
        velocidad_maxima= 50;
        System.out.println("El vehiculo de marca CHEVROLET " + nombre + " , y su velocidada maxima es de: " + velocidad_maxima);//imprime en consola
    }

    public void frena(String nombre) {//metodo tipo string frena
        color = "ROJO";
        System.out.println("El vehiculo de marca CHEVROLET de color "+ color + nombre + " con firmesa.");//imprime en consola
    }

    public void costo() {//metodo tipo string costo
        valor = 15000;
        
        System.out.println("El vehiculo de marca CHEVROLET de  " + valor + " es conveniente.");//imprime en consola
    }
    
    
    
}

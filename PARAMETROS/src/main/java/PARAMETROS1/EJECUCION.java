/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARAMETROS1;//PAQUETE

/**
 *
 * @author Veronica
 */
public class EJECUCION { //CLASE VARIABLE DE FUNCION PUBLICA OBJETO
    public static void main(String[] args) {//METODO PRINCIPAL
        AUTOMOVIL A = new AUTOMOVIL ();//INSTANCIA DEL OBJETO
        A.enciende(" enciende ");
        A.acelera(" acelera ");
        A.frena(" frena ");
        A.costo();
        
    }
    
}

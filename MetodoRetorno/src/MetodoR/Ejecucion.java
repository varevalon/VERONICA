/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoR;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author VERO A
 */
public class Ejecucion {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Primer Número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Segundo Número"));
        DecimalFormat df = new DecimalFormat("#.00");
        OPERACIONES Op = new OPERACIONES();
        JOptionPane.showMessageDialog(null, "La suma es: "+Op.suma(n1,n2) + "\n" 
                                           +"La resta es: "+Op.resta(n1,n2) 
                                     + "\n"+"La multiplicación es: "+Op.multiplicacion(n1,n2) + "\n"
                                          +" La división es: "+df.format(Op.division(n1,n2))+ "\n");
        /*System.out.println(" La suma es: "+Op.suma(n1,n2));
        System.out.println(" La resta es dfsdfsdf: "+Op.resta(n1,n2));
        System.out.println(" La multiplicación es: "+Op.multiplicacion(n1,n2));
        System.out.println(" La división es: "+Op.division(n1,n2));*/
        
        
    }
}

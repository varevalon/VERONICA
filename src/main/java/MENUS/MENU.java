package MENUS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
        

/**
 *
 * @author Veronica
 */
public class MENU {
    Scanner entrada=new Scanner(System.in);
    OPERACIONES objperaciones=new OPERACIONES ();
    
    public String opcionesMenus(){
        String ob=JOptionPane.showInputDialog("Ingrse una opcion: \n"
        +"1.- SUMA\n"
        +"2.- RESTA\n"
        +"3.- MULTIPLICACION\n"
        +"4.- DIVISION\n"
        +"5.- SALIR");
    return ob;

    }
    
    public void menuScanner()
    {
       
       Double suma, resta, multiplicacion, division;
        String op=" ";
        do{
            op=opcionesMenus();
       switch (op) {
            case "1":
                suma=objperaciones.suma();
                break;
            case "2":
                resta=objperaciones.resta();
                break;
            case "3":
                multiplicacion=objperaciones.multiplicacion();
                break;
            case "4":
                division=objperaciones.division();
                break;
            
        }
            
        }while(!op.equals("5")); 
    
    
            }
}
        
        
    
     
    
    


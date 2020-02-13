package MENUS;

import javax.swing.JOptionPane;

/**
 *
 * @author Veronica
 */
public class OPERACIONES {
    double numero1, numero2, resultado;
    String bt="";
    
public OPERACIONES (){    
    
}
public OPERACIONES (int n1, int n2){
    this.numero1=n1;
    this.numero2=n2;
}
public Double suma(){
    numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Primer Numero"));
    numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Segundo Numero"));
    resultado=numero1+numero2;
    JOptionPane.showInputDialog("La suma es: "+String.valueOf(resultado));
    return resultado;
}
public Double resta(){
    numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Primer Numero"));
    numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Segundo Numero"));
    resultado=numero1-numero2;
    JOptionPane.showInputDialog("La resta es: "+String.valueOf(resultado));
    return resultado;
}
public Double multiplicacion(){
    numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Primer Numero"));
    numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Segundo Numero"));
    resultado=numero1*numero2;
    JOptionPane.showInputDialog("La multiplicacion es: "+String.valueOf(resultado));
    return resultado;
}
public Double division(){
    numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Primer Numero"));
    numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Segundo Numero"));
    resultado=numero1/numero2;
    JOptionPane.showInputDialog("La division es: "+String.valueOf(resultado));
    return resultado;
}
}

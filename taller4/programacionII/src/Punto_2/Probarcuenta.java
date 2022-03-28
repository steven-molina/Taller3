
package Punto_2;

import javax.swing.JOptionPane;

public class Probarcuenta {
    public static void main(String[] args) {
        
        UML_a_codigo cliente = new UML_a_codigo();
        
    String nombreCliente;
    int nocuenta;
    double saldo;
    int opcion;
    
    
    nombreCliente = JOptionPane.showInputDialog("ingrese el nommbre del cliente");
    nocuenta =  Integer.parseInt(JOptionPane.showInputDialog("ingrese el nombre de la cuenta"));
    saldo = Double.parseDouble(JOptionPane.showInputDialog("indrese el saldo de la cuenta"));
    
    
    cliente.setnombreCliente(nombreCliente);
    cliente.setnocuenta(nocuenta);
    cliente.setsaldo(saldo);
    
    

    do {
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                + "------datos------\n"
                + "Nombre:     "+ cliente.getnombreCliente()
                + "\n Numero de cuenta:   "+ cliente.getnocuenta()
                + "\n saldo:    "+ cliente.getsaldo()
                + "\n ----¿que opcion desea realizar?---- \n"+
                                                          "1.consignar"
                                                        + "\n 2.retirar"
                                                        + "\n 3.salir"
                                                           ));
    if (opcion == 1){
       
         cliente.setconsignar(Double.parseDouble(JOptionPane.showInputDialog("cuanto desea consignar?")));      
    }
    if (opcion == 2){
       
         cliente.setretirar(Double.parseDouble(JOptionPane.showInputDialog("cuanto desea consignar?")));      
    } 
    } while (opcion != 3);
        
 
   
    
    
    
    
    
    
    
    
    
    
    }
}

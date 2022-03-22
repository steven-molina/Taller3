package Punto2;

import javax.swing.JOptionPane;

public class Punto2 {
    public static void main(String[] args){
        int saldo, abonado, deudas, credito, SaldoFinal; 
        
        saldo = Integer.parseInt(JOptionPane.showInputDialog("ingrese su saldo incial: "));
        abonado = Integer.parseInt(JOptionPane.showInputDialog("ingres el total de abonos en el mes: "));
        deudas = Integer.parseInt(JOptionPane.showInputDialog("ingres el total de deducciones aplicadas: "));
        credito = Integer.parseInt(JOptionPane.showInputDialog("ingres el limite de creditos permitido: "));
        
        SaldoFinal = saldo + abonado - deudas;
        
        if(SaldoFinal > credito){
            JOptionPane.showMessageDialog(null, "Se excedió el límite de su crédito");
        }else{
            JOptionPane.showMessageDialog(null,"no excedió el límite de su crédito");
        }
        
    }
}

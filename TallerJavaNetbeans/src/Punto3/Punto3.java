package Punto3;

import javax.swing.JOptionPane;

public class Punto3 {

    public static void main(String[] args) {
        int[] d = new int[7];
        int IngresoSemana, ValorA = 9, ValorB = 9, vendido = 0, acumulador1 = 0, acumulador2 = 0;
        double aumento1, aumento2;
        IngresoSemana = 200;


        for (int i = 0; i <= 6; i++) {
            d[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el total vendido el dia " + (i + 1)));
            vendido += d[i];
        }

        if (vendido > 3000) {
            acumulador1 = 5;
            if (vendido > 5000) {
                acumulador1 = 7;
                if (vendido > 7000) {
                    acumulador1 = 10;
                }
            }
        }
        ValorA += acumulador1;

        if (vendido > 5000) {
            acumulador2 = 7;
            if (vendido > 10000) {
                acumulador2 = 10;
                if (vendido > 15000) {
                    acumulador2 = 13;
                }
            }

        }
        ValorB += acumulador2;

        aumento1 = IngresoSemana + ((vendido * ValorA) / 100);
        aumento2 = IngresoSemana + ((vendido * ValorB) / 100);

        JOptionPane.showMessageDialog(null, "el pago semanal en la categoria A es: " + aumento1);
        JOptionPane.showMessageDialog(null, "el pago semanal en la categoria B es: " + aumento2);
    }
}

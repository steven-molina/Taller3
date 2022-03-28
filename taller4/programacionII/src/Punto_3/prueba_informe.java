
package Punto_3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class prueba_informe {
    
    public static void main(String[] args){
        
        informe datos = new informe();
        JTextArea salida = new JTextArea();
        for(int i=0;i<12;i++){
            datos.setventas(Double.parseDouble(JOptionPane.showInputDialog("ingrese el total de ventas del mes: "+(i+1))), i);
        }
        
        salida.append("------Datos-------\n");
        salida.append("el promedio de ventas del año es: "+datos.getpromedio_ventas()+"\n");
        salida.append("el acumulado total de ventas en el año es: "+datos.getacumulado()+"\n");
        salida.append("el mes - "+datos.getmayor()+" - tuvo mayores ventas.\n");
        salida.append("el mes - "+datos.getmenor()+" - tuvo menores ventas.\n");
        
        JOptionPane.showMessageDialog(null, salida);
    }
}

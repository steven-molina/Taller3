package Punto4;

import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args){
        Scanner escanear = new Scanner(System.in);
        int num, extra=0;
        
        System.out.print("¿cuantos empleados va a registrar?: ");
        num = escanear.nextInt();
        
        String empleados[] = new String[num];
        int HorasTrabajo[] = new int[num];
        double pago_b[] = new double[num];
        double pago[] = new double[num];
        
        for(int i=0;i<num;i++){
            System.out.println("\n--- Datos del empleado ---");
            System.out.print("ingrese el nombre del empleado: ");
            empleados[i] = escanear.next();
            System.out.print("ingrese el numero de horas trabajadas en la semana: ");
            HorasTrabajo[i] = escanear.nextInt();
            System.out.print("ingrese la tarifa por hora: ");
            pago_b[i] = escanear.nextDouble();
            
            if (HorasTrabajo[i] > 40){
                extra = HorasTrabajo[i]-40;
                pago[i] = (pago_b[i]*40)+(extra * (pago_b[i]*1.5));
            }
            else{
                extra = 0;
                pago[i] = (pago_b[i]*HorasTrabajo[i])+(extra * (pago_b[i]*1.5));
            }
            
            
        }
        
        System.out.println("--- Resultado ----");
        for(int i=0;i<num;i++){
            
            System.out.println("El sueldo bruto semanal de "+ empleados[i]+" es: "+pago[i]);
        }
        
    }
}

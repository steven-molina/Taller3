package Punto1;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args){
        
        Scanner escanear = new Scanner(System.in);
        
        int valor, productos=0, ingresos=0;
        int MaxVendido=0, CodigoM = 0, CostosoM=0, CodigoMax =0;
        
        System.out.print("¿cuantos productos vendio hoy?: ");
        valor = escanear.nextInt();
        
        int[] A = new int[valor];
        int[] B = new int[valor];
        int[] C = new int[valor];
        
        for(int i=0;i<=valor-1;i++){
            System.out.println("\nProducto No. "+(i+1));
            
            System.out.print("Codigo producto: ");
            A[i] = escanear.nextInt();
            
            System.out.print("Valor producto: ");
            B[i] = escanear.nextInt();
            
            System.out.print("Cantidad vendida: ");
            C[i] = escanear.nextInt();
            
            productos += C[i];
            ingresos += (B[i]*C[i]);
            
            if(C[i] > MaxVendido){
                MaxVendido = C[i];
                CodigoM = A[i];
            }
            if(B[i] > CostosoM){
                CostosoM = B[i];
                CodigoMax = A[i];
            }
            
        }
        System.out.println("\n------ Resultado ------");
        System.out.println("el total de productos vendidos es: "+productos);
        System.out.println("el total de ingresos del dia es: "+ ingresos);
        System.out.println("el codigo del producto mas vendido es: "+CodigoM);
        System.out.println("el codigo del producto mas costoso es: "+CodigoMax);
    }
}

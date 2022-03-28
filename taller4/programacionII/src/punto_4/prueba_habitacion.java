
package punto_4;

import java.util.Scanner;



public class prueba_habitacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        habitacion habitacion = new habitacion();  
        double largo,ancho,altura;
        
        System.out.println("Habitación\n");
        
        System.out.print("Digite el largo de la habitación: ");
        largo = sc.nextDouble();
        
        System.out.print("Digite el ancho de la habitación: ");
        ancho = sc.nextDouble();
        
        System.out.print("Digite la altura de la habitación: ");
        altura = sc.nextDouble();
        
        habitacion.setLargo(largo);
        habitacion.setAncho(ancho);
        habitacion.setAlto(altura);
        
        System.out.print("\n¿Tapizado liso o con diseño? [L/d]: ");
        String decision = sc.next().toUpperCase();
        
        System.out.printf("\nLa cantidad de metros cuadrados de piso a cubrir "
                + "es de %.2f\n",habitacion.enchapar());
        
        double tapiz = Math.round(habitacion.tapizar(decision));
        System.out.printf("La cantidad de rollos para tapizar la pared "
                + "es de %.0f\n",tapiz);  
    }
}

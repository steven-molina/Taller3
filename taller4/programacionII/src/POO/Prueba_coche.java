
package POO;

import javax.swing.JOptionPane;

public class Prueba_coche {
    
    public static void main(String[] args) {
        
        Coche op  = new Coche();
        
    String color;
    String marca;
    int modelo;
    int caballos_de_fuerza;
    String Matricula;
    int numero_puertas;
    
    color = JOptionPane.showInputDialog("digite el color del auto");
    marca = JOptionPane.showInputDialog("digite el marca del auto");
    modelo = Integer.parseInt(JOptionPane.showInputDialog("digite el modelo del auto"));
    caballos_de_fuerza = Integer.parseInt(JOptionPane.showInputDialog("digite los caballos de fuerza del auto"));
    Matricula= JOptionPane.showInputDialog("digite la matricula del auto");
    numero_puertas= Integer.parseInt(JOptionPane.showInputDialog("digite cuantas puertas tiene el auto"));
    
    op.setMatricula(Matricula);
    op.setcaballos_de_fuerza(caballos_de_fuerza);
    op.setcolor(color);
    op.setmodelo(modelo);
    op.setmarca(marca);
    op.setnumero_puertas(numero_puertas);
    
    JOptionPane.showMessageDialog(null, "      caracteristicas \n"+
            " el color es: "+ op.getcolor()+
            "\n el modelo es:  "+ op.getmodelo()+   
            "\n la marca es:  "+ op.getmarca()+
            "\n el numero de puertas es:  "+ op.getnumero_puertas()+
            "\n la matricula es: "+ op.getMatricula()+
            "\n los caballos de fuerza son:  "+ op.getcaballos_de_fuerza());
    

    }
}

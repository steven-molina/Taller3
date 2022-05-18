package modelo;
import java.util.Scanner;

public class banco {
    private String nombre,direccion,ciudad;
    private sede sedes[] = new sede[30];
    private int numSedes;
    
    public banco(){
        this.nombre = "";
        this.direccion = "";
        this.ciudad = "";
        this.numSedes = 0;
    }

    public banco(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.numSedes = 0;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public int getNumSedes(){
        return this.numSedes;
    }
    
    public void crearSede(int num1, Scanner sc){
        
        sedes[num1] = new sede();
        System.out.print("Digite el nombre de la sede: ");sedes[num1].setNombre(sc.nextLine());
        System.out.print("Digite la ciudad de la sede: ");sedes[num1].setCiudad(sc.nextLine());
        System.out.print("Digite la direccion de la sede: ");sedes[num1].setDireccion(sc.nextLine());
        this.numSedes++;
    }
    public sede seleccionarSede(int num2){
        return sedes[num2];
    }
}

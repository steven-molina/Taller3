package modelo;
import java.util.Scanner;

public class cuenta_bancaria {
    private int NoCuenta;
    private String tipo;
    private double saldoInicial,saldo;
    private final usuario titular;
    
    public cuenta_bancaria(){
        this.NoCuenta = 0;
        this.tipo = "";
        this.saldoInicial = 0;
        this.saldo = 0;
        this.titular = new usuario();
    }

    public int getNoCuenta(){
        return NoCuenta;
    }
    public void setNoCuenta(int NoCuenta){
        this.NoCuenta = NoCuenta;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public double getSaldoInicial(){
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial){
        this.saldoInicial = saldoInicial;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setTitular(Scanner sc){
        
        System.out.print("Digite la cédula del titular: ");titular.setCc(sc.nextLine());
        System.out.print("Digite el nombre del titular: ");titular.setNombre(sc.nextLine());
        System.out.print("Digite el apellido del titular: ");titular.setApellido(sc.nextLine());
        System.out.print("Digite el sexo: ");titular.setSexo(sc.nextLine().charAt(0));
    }
    public usuario getTitular(){return this.titular;}
}

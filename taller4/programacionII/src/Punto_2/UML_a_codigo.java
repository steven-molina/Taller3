/*
Implementar en java la clase que se indica en el diagrama de clases (figura), incluyendo las validaciones necesarias
en los métodos consignar y retirar. Crear una clase principal en la que se cree un objeto de dicha clase, se lean por
consola sus atributos y probar sus métodos(también leyendo por consola los valores correspondientes).
*/
package Punto_2;

public class UML_a_codigo {
    
    // Atributos
    
    String nombreCliente;
    int nocuenta;
    double saldo;
    
    //encapsulamiento
    
    public String getnombreCliente (){
        return nombreCliente;
    }
        public void setnombreCliente (String nombreCliente){
            this.nombreCliente=nombreCliente;
    }
    
    public int getnocuenta (){  
        return nocuenta;
    }
        public void setnocuenta (int nocuenta){
            this.nocuenta=nocuenta;
    }
    public double getsaldo (){
        return saldo;
        } 
        public void setsaldo (double saldo){
            this.saldo = saldo;
    }
     
    
        public void setconsignar (double monto){
            this.saldo += monto;
    }
        
        public void setretirar (double monto){
            this.saldo -= monto ;
    }
      
}
 
        

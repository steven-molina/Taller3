/*
Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de
caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos que considere
necesarios. Crear una clase PruebaCoche que instancie varios coches, cambie sus estados (valores de sus atributos)
y muestre sus datos por pantalla
 */
package POO;

public class Coche {
    
    //Atributos 
    
    String color;
    String marca;
    int modelo;
    int caballos_de_fuerza;
    String Matricula;
    int numero_puertas;
    
    //encapsulamiento
    
    public String getcolor (){
        return color;
    }
       public void setcolor (String color){
            this.color=color;
    }
    
    public String getmarca (){  
        return marca;
    }
       public void setmarca (String marca){
            this.marca=marca;
    }
    public int getmodelo (){
        return modelo;
        } 
       public void setmodelo (int modelo){
            this.modelo = modelo;
    }
    
    public int getcaballos_de_fuerza (){
        return caballos_de_fuerza;
        } 
    
        public void setcaballos_de_fuerza (int caballos_de_fuerza){
            this.caballos_de_fuerza= caballos_de_fuerza;
    }
    
    public String getMatricula (){
        return Matricula;
        }
         public void setMatricula (String Matricula){
            this.Matricula=Matricula;
    }
    
    public int getnumero_puertas (){
        return numero_puertas;
        } 
         public void setnumero_puertas (int numero_puertas){
            this.numero_puertas=numero_puertas;
    }
        
}


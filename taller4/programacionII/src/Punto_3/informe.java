/*
 Implementar la clase Informe, la cual contiene el reporte de ventas de cada mes de una empresa. Estos reportes se
encuentran almacenados en un vector de tamaño 12, donde el primer elemento contiene el reporte de ventas de enero,
el segundo el reporte de febrero y así sucesivamente. Incluya método constructor, getter y setter y métodos para
calcular: el promedio de ventas del año, el mes con menos ventas, el mes con mayores ventas, el acumulado de ventas
del año. Cree una clase principal en la cual se cree un objeto Informe y se muestre sus resultados
 */
package Punto_3;

public class informe {
    
    double ventas[]=new double[12];
    double promedio_ventas;
    double acumulado;
    double mayor;
    double menor;
    int mesmayor;
    int mesmenor;
    
    public informe() {
        this.acumulado=0;
        this.menor=0;
        this.mayor=0;
        this.promedio_ventas=0;
       

     }
        public double getventas (int i){
        return ventas[i];
        } 
        public void setventas (double ventas, int i){
            this.ventas[i] = ventas;
        } 
        
        public double getpromedio_ventas (){
            double suma=0;
            for(int i = 0; i < 12; i ++){
                
                suma += this.ventas[i];               

        }
            this.promedio_ventas= suma/12;     
        return promedio_ventas;
        } 
       
        
         public double getacumulado (){
             double acum = 0;
           for(int i = 0; i < 12; i ++){
                
                acum+= this.ventas[i];               

        }  
           this.acumulado = acum;
             
        return acumulado;
        } 
        
         public double getmayor (){
             for(int i = 0; i < 12; i ++){
                 
                if (this.ventas[i]>this.mayor){
                    
                    this.mayor = this.ventas[i];
                    
                    mesmayor=i+1;      
                    
                }
                           

        }
             
             
        return mesmayor;
        } 
       
         public double getmenor (){
             for(int i = 0; i <= 12; i ++){
                 
                if (this.ventas[i]<this.menor){
                    
                    this.menor = this.ventas[i];
                    
                    mesmenor=i+1;                          
                }                           
        }
        return mesmenor;
        } 
         
 
        
}

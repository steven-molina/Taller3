
package punto_4;


    public class habitacion {
    double largo;
    double ancho;
    double alto;
    
    public habitacion(){
        
        this.largo = 0;
        this.ancho = 0;
        this.alto = 0;
    }
    
    public void setLargo(double largo){
        this.largo = largo;}
    
    public void setAncho(double ancho){
        this.ancho = ancho;}
    
    public void setAlto(double alto){
        this.alto = alto;}
    
    public double enchapar(){
        
        double Enchape = this.largo*this.ancho;
        
        double Total_E = Enchape+Enchape*0.15;
        
        return Total_E;
    }

    float tapizar(String decision) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  }


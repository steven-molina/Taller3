package modelo;

public class usuario {
    private String cc,nombre,apellido;
    private char sexo;
    
    public usuario(){
       this.cc = "";
       this.nombre = "";
       this.apellido = "";
       this.sexo = 'N';
    }

    public String getCc(){
        
        return cc;
    }
    public void setCc(String cc){
        this.cc = cc;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
}

package Punto2;


public class Empleado {
    private String Nombre;
    
    
 public Empleado(){ 
 }  
 
 public Empleado(String Nombre){
 this.Nombre=Nombre;
 }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    public String toString(){
    return "Empleado: "+this.Nombre;
    }   
 
}

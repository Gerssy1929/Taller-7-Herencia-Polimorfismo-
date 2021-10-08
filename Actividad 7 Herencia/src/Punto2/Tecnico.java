
package Punto2;


public class Tecnico extends Operario {
    
    public Tecnico(String Nombre) {
        super(Nombre);
    }
    
    @Override
    public String toString(){
    return super.toString()+"--->Tecnico";
    }   
}

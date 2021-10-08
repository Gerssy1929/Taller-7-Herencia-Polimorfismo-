
package Punto2;


public class Oficial extends Operario{
    
    public Oficial(String Nombre) {
        super(Nombre);
    }
    
    
   
    @Override
    public String toString(){
    return super.toString()+"--->Oficial";
    
    }   
    
}

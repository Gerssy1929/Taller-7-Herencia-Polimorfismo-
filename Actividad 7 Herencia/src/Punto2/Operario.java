
package Punto2;


public class Operario extends Empleado {

public Operario(String Nombre){
super(Nombre);
}


@Override
public String toString(){
    return super.toString()+"--->Operario";
    }   
}

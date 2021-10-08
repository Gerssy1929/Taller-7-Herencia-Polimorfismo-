
package Punto3;

import java.util.Date;


public class Profesorinterino extends Profesor{
    private Date Fecha;

   
    public Profesorinterino(String nombre, String apellido, String id, Date Fecha) {
        super(nombre,apellido,id);
        this.Fecha=Fecha;
    }
    public Profesorinterino(String apellido, String id, Date Fecha){
    super(apellido,id);
    this.Fecha=Fecha;
    
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    @Override
    public String infoprof(){
        return this.toString()+"(Interino 1)"+" Se incorporó en la fecha: "+this.Fecha;
    }
}
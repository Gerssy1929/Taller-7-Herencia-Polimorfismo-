
package Punto3;


public class Profesor extends Persona{
    private String id;
    
    public Profesor(String nombre, String apellido,String id) {
        super(nombre,apellido);
        this.id=id;
    }   
    
    public Profesor(String apellido, String id){
    super(apellido);
    this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
   public String infoprof(){
       return this.toString()+" con Id de profesor: "+this.id;
   }
}

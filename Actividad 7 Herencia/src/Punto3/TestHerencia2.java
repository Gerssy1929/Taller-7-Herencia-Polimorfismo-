
package Punto3;

import java.util.Date;

public class TestHerencia2 {
    
    public static void main(String[] args) {
        
    Date d =new Date();
    Profesor Pi = new Profesorinterino("German","Ardila","Prof 29-321-15",d);
    System.out.println(Pi.infoprof());
    
    }
    
}

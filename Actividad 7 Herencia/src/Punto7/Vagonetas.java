/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

/**
 *
 * @author German
 */
public class Vagonetas extends Compactos {
    
    private String traccion;
    
    public Vagonetas(long numseriemotor, String marca, int año, long precio, int cantpasaj, String traccion) {
        super(numseriemotor, marca, año, precio, cantpasaj);
        this.traccion=traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    
    @Override
    public String infov(){
        System.out.println("Vagoneta");
        return super.infov()+"\nTracción: "+this.traccion;
    }
}

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
public abstract class Vehiculo {
    
    private long numseriemotor;
    private String marca;
    private int año;
    private long precio;
    
    public Vehiculo(long numseriemotor, String marca, int año, long precio){
        this.numseriemotor=numseriemotor;
        this.marca=marca;
        this.año=año;
        this.precio=precio;
    }

    public long getNumseriemotor() {
        return numseriemotor;
    }

    public void setNumseriemotor(long numseriemotor) {
        this.numseriemotor = numseriemotor;
    }

   
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    public String toString(){
        return "Número de Serie del motor: "+this.numseriemotor
                +"\nMarca: "+this.marca+"\nAño(modelo): "+this.año+"\nPrecio: "+this.precio+" USD";
    }
    
    public abstract String infov();
    
}

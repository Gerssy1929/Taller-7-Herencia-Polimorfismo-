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
public class Compactos extends Vehiculo{
    private int cantpasaj;
    

    public Compactos(long numseriemotor, String marca, int año, long precio, int cantpasaj) {
        super(numseriemotor, marca, año, precio);
        this.cantpasaj=cantpasaj;
    }

    public int getCantpasaj() {
        return cantpasaj;
    }

    public void setCantpasaj(int cantpasaj) {
        this.cantpasaj = cantpasaj;
    }
    
    
    @Override
    public String infov(){
        return super.toString()+"\nCant de Pasajeros: "+this.cantpasaj;
    }
}

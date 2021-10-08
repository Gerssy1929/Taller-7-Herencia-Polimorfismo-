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
public class Camionetas extends Vehiculo{
    private float carga;
    private int cantejes;
    private int cantrod;

    public Camionetas(long numseriemotor, String marca, int año, long precio, float carga, int cantejes, int cantrod){
        super(numseriemotor, marca, año, precio);
        this.carga=carga;
        this.cantejes=cantejes;
        this.cantrod=cantrod;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public int getCantejes() {
        return cantejes;
    }

    public void setCantejes(int cantejes) {
        this.cantejes = cantejes;
    }

    public int getCantrod() {
        return cantrod;
    }

    public void setCantrod(int cantrod) {
        this.cantrod = cantrod;
    }
    
    @Override
    public String infov(){
        System.out.println("Camioneta");
        return super.toString()+"\nCapacidad de Carga: "+this.carga+" Kgs"
                +"\nCantidad de ejes: "+this.cantejes+"\nCantidad de rodadas: "+this.cantrod;
    }
}

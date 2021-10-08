
package Punto6;


public class Compañia {
    private int Semanas;
    private int pagoHora;
    
    public Compañia(int Semanas,int pagoHora){
    this.Semanas=Semanas;
    this.pagoHora=pagoHora;
    
    }

    public int getSemanas() {
        return Semanas;
    }

    public void setSemanas(int Semanas) {
        this.Semanas = Semanas;
    }

    public int getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(int pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    @Override
    public String toString(){
     
        return"En la compañia---->En "+Semanas+" semanas"+" Se pago por hora--> $ "+pagoHora ;
    
    }
    
    
}


package Punto6;


public class Empleado extends Compañia {
        private int horas;

    public Empleado(int Semanas, int pagoHora,int horas) {
        super(Semanas, pagoHora);
        this.horas=horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
        @Override
    public String toString(){
        
        return super.toString()+" El empleado--->";
    
    
    }
}

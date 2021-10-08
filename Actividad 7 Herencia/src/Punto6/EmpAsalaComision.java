
package Punto6;


public class EmpAsalaComision extends EmpAsalariado{
    private int PorcenAgregacion;

    public EmpAsalaComision(int Semanas, int pagoHora, int horas, int SalarioFijo,int PorcenAgregacion) {
        super(Semanas, pagoHora, horas, SalarioFijo);
        this.PorcenAgregacion=PorcenAgregacion;
    }

    public int getPorcenAgregacion() {
        return PorcenAgregacion;
    }

    public void setPorcenAgregacion(int PorcenAgregacion) {
        this.PorcenAgregacion = PorcenAgregacion;
    }
@Override
    public String toString(){
        
        return super.toString()+"Empleado Asalariado por Comision "
                +"\n Tiene un salario fijo de: "+getSalarioFijo()+" Y trabajo: "+(getHoras())*getSemanas()
                +"\nY Se gana un 10% mas de su salario, entonces su salario final seria: "+((getSalarioFijo()*PorcenAgregacion/100)+getSalarioFijo());
                
    
    
    }       
    
    
}

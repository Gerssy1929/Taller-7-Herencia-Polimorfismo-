
package Punto6;

public class EmpAsalariado extends Empleado {
    private int SalarioFijo;

    public EmpAsalariado(int Semanas, int pagoHora, int horas,int SalarioFijo) {
        super(Semanas, pagoHora, horas);
        this.SalarioFijo=SalarioFijo;
    }

    public int getSalarioFijo() {
        return SalarioFijo;
    }

    public void setSalarioFijo(int SalarioFijo) {
        this.SalarioFijo = SalarioFijo;
    }
    
    @Override
    public String toString(){
        
        return super.toString()+" Empleado Asalariado---> Tienen un Salario fijo de: "+this.SalarioFijo
                +"\n Y trabajo: "+(getHoras())*getSemanas();
    
    
    }
    
}

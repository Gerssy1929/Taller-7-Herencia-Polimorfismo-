
package Punto6;


public class EmpHoras extends Empleado{    
    private int horextras;

    public EmpHoras(int Semanas, int pagoHora, int horas,int horextras) {
        super(Semanas, pagoHora, horas);
        this.horextras=horextras;
    }

    public int getHorextras() {
        return horextras;
    }

    public void setHorextras(int horextras) {
        this.horextras = horextras;
    }
    
    
   @Override
    public String toString(){
        
        return super.toString()+"Empleado por hora y extra "
                +"\nTrabajo :"+getHoras()+"horas y Con horas extras de: "+horextras
                +"\nPor lo tanto su salario es de: "+(((getHoras()+horextras)*getPagoHora())*getSemanas()) ;
    
    
    }       
    
}

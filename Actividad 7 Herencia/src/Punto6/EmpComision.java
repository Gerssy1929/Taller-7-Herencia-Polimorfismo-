
package Punto6;


public class EmpComision extends Empleado{
    private int ventas;

    public EmpComision(int Semanas, int pagoHora, int horas,int ventas) {
        super(Semanas, pagoHora, horas);
        this.ventas=ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    @Override
    public String toString(){
        
        return super.toString()+"Empleado por Comision "
                +"\nTrabajo :"+getHoras()+"horas ,vendio: "+ventas+" productos de 50000 y se lleva un 5%"
                +"\nPor lo tanto su salario es de: "+((getHoras()*getPagoHora())+((ventas*50000)*0.05))*getSemanas();
    
    
    }       
    
}

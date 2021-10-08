
package Punto6;


public class Instancias {
    public static void main(String[] args) {
        Compañia Co = new Compañia(1,30000);
        System.out.println(Co.toString()+"\n---------------------------------------");
        
        Empleado Em = new Empleado(1,30000,28);
        System.out.println(Em.toString()+"\n---------------------------------------");
        
        EmpAsalariado EmA = new EmpAsalariado(1,30000,28,5000000);
        System.out.println(EmA.toString()+"\n---------------------------------------");
        
        EmpHoras EmH = new EmpHoras(1,30000,25,0);
        System.out.println(EmH.toString()+"\n---------------------------------------");
        
        EmpComision EmC = new EmpComision(1,30000,25,40);
        System.out.println(EmC.toString()+"\n---------------------------------------");
        
        EmpAsalaComision EmAC = new EmpAsalaComision(1,30000,25,5000000,20);
        System.out.println(EmAC.toString()+"\n---------------------------------------");
    }
    
}

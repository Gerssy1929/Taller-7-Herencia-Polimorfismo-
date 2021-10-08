
package Punto4;


public class Portátil extends Ordenador {
    private float peso;
    
    
    public Portátil(){
        super();
    }
    
    public Portátil(int codigo, int precio, float peso){
        super(codigo, precio, "Ideal para sus viajes");
        this.peso=peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    @Override
    public String infoOrdenadores(){
        System.out.println("Aqui está su Ordenador Portátil");
        return super.imprimirDatos()
                + "Peso: "+this.peso+" Kg\n";
    }
    
}


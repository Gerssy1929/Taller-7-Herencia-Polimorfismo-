
package Punto4;


public abstract class Ordenador {
    private int codigo;
    private int precio;
    private String eslogan;
    public Ordenador (){
        
    }
    
    public Ordenador (int codigo, int precio, String eslogan){
        
        this.codigo=codigo;
        this.precio=precio;
        this.eslogan=eslogan;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }
    
  public String imprimirDatos(){
        return "Código: "+this.codigo
                + "\nPrecio: "+this.precio
                + "\nEslogan: "+this.eslogan+"\n";          
    }
  
  public abstract String infoOrdenadores();
}

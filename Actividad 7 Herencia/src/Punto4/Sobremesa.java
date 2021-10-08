/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author German
 */
public class Sobremesa extends Ordenador {
    private String tipo_torre;
    
    public Sobremesa(){
        super();   
    }
    
    public Sobremesa(int codigo, int precio, String tipo_torre){
        super(codigo, precio, "El que más pesa, pero el que menos cuesta");
        this.tipo_torre=tipo_torre;
    }

    public String getTipo_torre() {
        return tipo_torre;
    }

    public void setTipo_torre(String tipo_torre) {
        this.tipo_torre = tipo_torre;
    }
    
    @Override
    public String infoOrdenadores(){
        System.out.println("Aqui está su Ordenador de Sobremesa");
        return super.imprimirDatos()
                + "Tipo de Torre: "+this.tipo_torre+"\n";
    }
}


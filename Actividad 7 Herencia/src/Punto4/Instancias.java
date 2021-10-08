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
public class Instancias {
    
    public static void main(String[] args) {
        
        Ordenador p = new Portátil(46561, 1500000, (float) 1.31);
        imprimirOrdenador(p);
        
        Ordenador s = new Sobremesa(34568, 850000, "Mini Torre (Micro-ATX)");
        imprimirOrdenador(s);
        
        
    }
    
        public static void imprimirOrdenador(Ordenador or){
        System.out.println("Informacion del ordenador: ");
        System.out.println("--------------------------------------");
        String tipo = (or instanceof Portátil)? "Portátil":"Sobremesa";
        System.out.println("Tipo: " + tipo);
        System.out.println(or.infoOrdenadores());
    
    }
}

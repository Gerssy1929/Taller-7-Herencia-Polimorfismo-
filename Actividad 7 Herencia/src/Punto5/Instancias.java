/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author German
 */
public class Instancias {
    public static void main(String[] args) {
        
        Cuadrilatero T = new Trapecio(-3,1, -2,5, 3,-4, -1,-2);
        System.out.println(T.Area()+"\n---------------------------------");
        
        Cuadrilatero R = new Rectangulo(2,-1, 7,-1, 7,3, 2,3);
        System.out.println(R.Area()+"\n---------------------------------");
        
       
        Cuadrilatero C  = new Cuadrado(3,3, -3,3, -3,-3, 3,-3);
        System.out.println(C.Area()+"\n--------------------------------");
 
    }
}

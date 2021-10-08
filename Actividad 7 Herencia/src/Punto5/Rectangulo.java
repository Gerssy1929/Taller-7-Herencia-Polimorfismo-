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
public class Rectangulo extends Cuadrilatero {
    
    public Rectangulo(int coxA, int coyA, int coxB, int coyB, int coxC, int coyC, int coxD, int coyD) {
        super(coxA, coyA, coxB, coyB, coxC, coyC, coxD, coyD);
    }
    
    @Override
    public String Area(){
       return super.calcularArea()+" (Rectángulo)";
    }
}
   

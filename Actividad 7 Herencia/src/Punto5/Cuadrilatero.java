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
public abstract class Cuadrilatero {
    //tendremos coordenadas X,Y para cada uno de los 4 vertices
    private int coxA;
    private int coyA;
    private int coxB;
    private int coyB;
    private int coxC;
    private int coyC;
    private int coxD;
    private int coyD;
    
    public Cuadrilatero(int coxA, int coyA, int coxB, int coyB, int coxC, int coyC, int coxD, int coyD){
        this.coxA=coxA;
        this.coyA=coyA;
        this.coxB=coxB;
        this.coyB=coyB;
        this.coxC=coxC;
        this.coyC=coyC;
        this.coxD=coxD;
        this.coyD=coyD;
        
    }

    public int getCoxA() {
        return coxA;
    }

    public void setCoxA(int coxA) {
        this.coxA = coxA;
    }

    public int getCoyA() {
        return coyA;
    }

    public void setCoyA(int coyA) {
        this.coyA = coyA;
    }

    public int getCoxB() {
        return coxB;
    }

    public void setCoxB(int coxB) {
        this.coxB = coxB;
    }

    public int getCoyB() {
        return coyB;
    }

    public void setCoyB(int coyB) {
        this.coyB = coyB;
    }

    public int getCoxC() {
        return coxC;
    }

    public void setCoxC(int coxC) {
        this.coxC = coxC;
    }

    public int getCoyC() {
        return coyC;
    }

    public void setCoyC(int coyC) {
        this.coyC = coyC;
    }

    public int getCoxD() {
        return coxD;
    }

    public void setCoxD(int coxD) {
        this.coxD = coxD;
    }

    public int getCoyD() {
        return coyD;
    }

    public void setCoyD(int coyD) {
        this.coyD = coyD;
    }

    
    
    public String calcularArea(){
        System.out.println("El area de la figura es:");
        float a;
        a=(this.coxA*this.coyD)+(this.coxD*this.coyC)+(this.coxC*this.coyB)+(this.coxB*this.coyA)
        -(this.coxA*this.coyB)-(this.coxB*this.coyC)-(this.coxC*this.coyD)-(this.coxD*this.coyA);
        if (a<0){
            return a/2*(-1)+" Unidades Cuadradas";
        }else 
            if (a>0){
                return a/2+" Unidades Cuadradas";
            }
        return null;    
    }
    
    
    public abstract String Area();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

/**
 *
 * @author German
 */
public class Instancias {
    public static void main(String[] args) {
        
        
        Vehiculo c= new Compactos(789562, "Chevrolet", 2010, 12000, 4);
        System.out.println(c.infov());
        System.out.println("Auto Compacto"+"\n----------------------------------");
        
        Vehiculo L = new Lujosos(456258, "Bugatti", 2020, 3000000, 2, 400);
        System.out.println(L.infov()+"\n-------------------------------------");
        
        Vehiculo V = new Vagonetas(741236, "Land Rover", 2016, 50000, 7, "Trasera");
        System.out.println(V.infov()+"\n-------------------------------------");
        
        Vehiculo C = new Camionetas(147896, "Ford", 2018, 55000, 600, 2, 1);
        System.out.println(C.infov()+"\n-------------------------------------");
        
    }
        
}

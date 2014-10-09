/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin04;
public class Boletin04 {
    public static void main(String[] args) {
        Semaforo sema1 = new Semaforo();
        String color;
        color = sema1.dameCor();
        System.out.println("El color antes de darle valor es: " + color);
        sema1.ponCor("Verde");
        color = sema1.dameCor();
        System.out.println("El color es: " + color);
    }
    
}

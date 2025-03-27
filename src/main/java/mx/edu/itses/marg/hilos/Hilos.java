/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.marg.hilos;

import Model.ThreadSimple;

/**
 *
 * @author tgjos
 */
public class Hilos {

    public static void main(String[] args) throws InterruptedException {
    Thread hilo = new ThreadSimple("Juan");
    
    Thread hilo2 = new ThreadSimple("Martinsillo");
    
      hilo2.start();
      hilo.start();
      System.out.println(hilo.getState());
     
            
    }
}

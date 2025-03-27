/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.marg.hilos;
import Model.ThreadSimple;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tgjos
 */
public class HilosR {

    public static void main(String[] args) {

        Runnable hilo = new Runnable() {
            @Override
            public void run() {
                System.out.println("Se inicia el metodo de:"
                        +  Thread.currentThread().getName());
                for (int i = 0; i < 10; i++) {
                    try{
                        Thread.sleep((long) (Math.random() * 1000));
                    }catch (InterruptedException ex){
                        Logger.getLogger(ThreadSimple.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Hilo finalizado" + Thread.currentThread().getName());
                }
                
            }
        };
       

        };
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }


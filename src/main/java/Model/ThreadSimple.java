/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tgjos
 */
public class ThreadSimple extends Thread{
    //constructor del Thread
      public ThreadSimple(String name) {
        super(name);
    }
      
      
      
      //Metodo run de inicializacion
    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo:" + getName());
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo:" + getName());
        }
        System.out.println("Hilo finalizado");
    }

  
    
}

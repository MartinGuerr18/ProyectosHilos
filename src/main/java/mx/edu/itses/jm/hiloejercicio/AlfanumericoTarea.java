/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.jm.hiloejercicio;

/**
 *
 * @author tgjos
 */

enum Tipo {
    NUMERO,
    LETRA
}

public class AlfanumericoTarea implements Runnable {
    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo == Tipo.NUMERO) {
            for (int i = 1; i < 10; i++) { // excluye el 10
                System.out.println(Thread.currentThread().getName() + " - Numero: " + i);
            }
        } else if (tipo == Tipo.LETRA) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(Thread.currentThread().getName() + " - Letra: " + c);
            }
        }
    }

    public static void main(String[] args) {

        Thread hilo1 = new Thread(new AlfanumericoTarea(Tipo.NUMERO), "Hilo-1");
        Thread hilo2 = new Thread(new AlfanumericoTarea(Tipo.LETRA), "Hilo-2");
        Thread hilo3 = new Thread(new AlfanumericoTarea(Tipo.NUMERO), "Hilo-3");
        Thread hilo4 = new Thread(new AlfanumericoTarea(Tipo.LETRA), "Hilo-4");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}




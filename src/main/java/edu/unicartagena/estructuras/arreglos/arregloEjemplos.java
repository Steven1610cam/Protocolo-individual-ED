package edu.unicartagena.estructuras.arreglos;

import java.util.Random;

/**
 *
 * @author STEVEN AF
 */
public class arregloEjemplos {
    public static void ejecutar() {
        System.out.println("\n--- Arreglos ---");

        
        int[] numeros = new int[10];
        Random random = new Random();

        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }
    }
}


package edu.unicartagena.estructuras.arreglos;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author STEVEN AF
 */
public class arregloEjemplos {
    public static void ejecutar() {
        System.out.println("\n--- Arreglos ---");
        
        int numeros[] = new int[10];
        Random random = new Random();
        
        for(int i =0; i < numeros.length; i++) {
        numeros[i] = random.nextInt(100);
        }
        
        //2.Recorrido e mostrar 
        //for clasico
        System.out.println("Recorido con for clasico");
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        
        }
        System.out.println();
        
        //for-each
        System.out.println("Recorrido con for-each:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 4. Búsqueda
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para buscar en el arreglo: ");
        int valorBuscado = scanner.nextInt();

        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El valor " + valorBuscado + " se halla en la posición " + posicion);
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo.");
        }
        
        // 3.	Modificación
        // cambiar valores impares por 0
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                numeros[i] = 0;
            }
        }
        System.out.println("Arreglo con impares cambiados a 0:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        //multiplicar valores por su índice
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * i;
        }
        System.out.println("Arreglo después de multiplicar cada valor por su índice:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        
         
    }
}


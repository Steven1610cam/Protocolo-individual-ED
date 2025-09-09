package edu.unicartagena.estructuras;

import java.util.Scanner;
import edu.unicartagena.estructuras.arreglos.arregloEjemplos;
import edu.unicartagena.estructuras.matrices.matricesEjemplos;
import edu.unicartagena.estructuras.proyecto.simuladorDeVentas;

public class ProtocoloIndividualUnidad1_DanielArroyo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Protocolo Individual Unidad 1 - Daniel Arroyo ===");
            System.out.println("1. Ejercicios con Arreglos");
            System.out.println("2. Ejercicios con Matrices");
            System.out.println("3. Proyecto: Simulador de Ventas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    arregloEjemplos.ejecutar();
                    break;
                case 2:
                    matricesEjemplos.ejecutar();
                    break;
                case 3:
                    simuladorDeVentas.ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}

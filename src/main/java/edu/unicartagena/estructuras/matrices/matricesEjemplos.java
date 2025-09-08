package edu.unicartagena.estructuras.matrices;

/**
 *
 * @author STEVEN AF
 */
public class matricesEjemplos {
    public static void ejecutar() {
        System.out.println("\n--- Matrices ---");
        
        
        int matriz[][] = new int[3][3];
        int valor = 1;
        
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                matriz[fila][col] = valor++;
            }
        }
        
        // 2. Recorido
        // Imprimir en forma de tablas
        System.out.println("Matriz en forma de tabla:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        // Recorrer por columnas
        System.out.println("Recorrido por columnas:");
        for (int col = 0; col < 3; col++) {
            for (int fila = 0; fila < 3; fila++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
        
        // 3. Operaciones
        // Sumar todos los elementos
        int suma = 0;
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                suma += matriz[fila][col];
            }
        }
        System.out.println("La suma de todos los elementos es: " + suma);

        // Intercambiar la primera fila con la última
        int[] temp = matriz[0];
        matriz[0] = matriz[2];
        matriz[2] = temp;

        System.out.println("Después de intercambiar la primera y última fila:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }
    

    }

}


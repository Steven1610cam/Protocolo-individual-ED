package edu.unicartagena.estructuras.matrices;

/**
 *
 * @author STEVEN AF
 */
public class matricesEjemplos {
    public static void ejecutar() {
        
        
        int matriz[][] = new int[3][3];
        int valor = 1;
        
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                matriz[fila][col] = valor++;
            }
        }
    

    }

}


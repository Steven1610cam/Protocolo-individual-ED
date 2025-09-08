package edu.unicartagena.estructuras.proyecto;

/**
 *
 * @author STEVEN AF
 */
public class simuladorDeVentas {
    public static void ejecutar() {
        System.out.println("\n--- Proyecto: Simulador de Ventas ---");
        
        
        // Productos
        String productos[] = {"BolloLimpio", "Suero", "Queso", "Yuca", "Chicha"};
        // Precios correspondientes
        double precios[] = {1000, 2500, 25000, 2500, 1500};
        // Ventas
        int cantidades[] = {10, 5, 2, 5, 12};
        
        
        
        
        // Total por producto
        double[] totales = new double[productos.length];
        for (int i = 0; i < productos.length; i++) {
            totales[i] = precios[i] * cantidades[i];
        }
        
        // Visualizar tabla de ventas
        System.out.println("Producto\tPrecio\tCantidad\tTotal");
        for (int i = 0; i < productos.length; i++) {           
            System.out.println(productos[i] + "\t" + precios[i] + "\t" +
                               cantidades[i] + "\t\t" + totales[i]);
        }
        
        // Total general
        double totalGeneral = 0;
        for (double total : totales) {
            totalGeneral += total;
        }
        System.out.println("\nTotal general de ventas: " + totalGeneral);
        

    
    }

}


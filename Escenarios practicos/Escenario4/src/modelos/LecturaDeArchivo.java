package modelos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Escenario 4: Método que lanza múltiples excepciones
 * Descripción: Tienes un método que abre un archivo y lo lee, pero puede lanzar excepciones si el archivo no existe o si hay un error de entrada/salida.
 */

 public class LecturaDeArchivo {
     
    /**
     * Lee el contenido de un archivo y lo imprime en la consola.
     *
     * @param rutaArchivo La ruta del archivo que se desea leer.
     * @throws FileNotFoundException Si el archivo no se encuentra en la ruta especificada.
     * @throws IOException Si ocurre un error de entrada/salida al leer el archivo.
     */
    
     public void leerArchivo(String rutaArchivo) throws FileNotFoundException, IOException {
        BufferedReader lector = null; 
        try {
            lector = new BufferedReader(new FileReader(rutaArchivo)); // Abre el archivo para lectura
            String linea;
            while ((linea = lector.readLine()) != null) { // Lee una línea del archivo
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error! El archivo no se encontró en la ruta especificada.");
            throw e; // Se propaga la excepción para que pueda ser manejada externamente
        } catch (IOException e) {
            System.err.println("Error! Ocurrió un problema al leer el archivo.");
            throw e;
        } finally {
            if (lector != null) { // Si el lector no es nulo, se cierra
                try {
                    lector.close();
                } catch (IOException e) {
                    System.err.println("Error: No se pudo cerrar el lector.");
                }
            }
        }
    }
}

import modelos.LecturaDeArchivo;

import java.io.FileNotFoundException;
import java.io.IOException;


public class App {
    public static void main(String[] args) {
        LecturaDeArchivo lector = new LecturaDeArchivo();
        try {
            lector.leerArchivo("K:\\Facultad\\Tercer Año\\Segundo Cuatrimestre\\POO 2\\Cursada 2024\\Semana2\\Tp2 JavaDoc\\archivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Excepción capturada: Archivo no encontrado.");
        } catch (IOException e) {
            System.err.println("Excepción capturada: Error de entrada/salida.");
        }
    }
}




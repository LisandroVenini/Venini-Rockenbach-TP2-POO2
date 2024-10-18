/*Escenario 1: Método que lanza una excepción
Descripción: Tienes un método que divide dos números, pero puede lanzar una excepción si el divisor es cero.*/

import modelos.DivisionPorCeroException;
import modelos.Division;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Realiza una operación de división y maneja una excepción en caso de 
 * que se intente dividir por cero.
 */
public class App {
    
    public static void main(String[] args) throws Exception {
        try {
            int numerador = 10;
            int denominador = 0;
            double resultado = Division.dividir(numerador, denominador); // Llamada al método que lanza la excepción
            System.out.println("Resultado: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
}

    
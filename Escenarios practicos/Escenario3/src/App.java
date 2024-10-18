/*
Escenario 3: Método con varios parámetros y retorno
Descripción: Tienes un método que calcula el índice de masa corporal (IMC) y devuelve un valor basado en el peso y la altura
 */

import modelos.CalculadoraIMC;

public class App {

    public static void main(String[] args) {
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        
        // Ejemplo de valores de peso y altura
        double peso = 70; // en kilogramos
        double altura = 1.75; // en metros

        // Llamada al método para calcular el IMC
        double imc = calculadoraIMC.calcularIMC(peso, altura);

        // Imprimir el resultado del IMC
        System.out.println("El IMC es: " + imc);
    }
}

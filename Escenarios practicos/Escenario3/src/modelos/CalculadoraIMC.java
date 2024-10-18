package modelos;
/**
 * Escenario 3: Método con varios parámetros y retorno
 *  Descripción: Tienes un método que calcula el índice de masa corporal (IMC) y devuelve un valor basado en el peso y la altura
 */
public class CalculadoraIMC {

    /** 
     * Método que calcula el IMC basado en peso (kg) y altura (m)
     * @param peso EL peso en Kg
     * @param altura La altura en Metros
     * @return El indice de masa corporal (imc)
     * @throws IllegalArgumentException Si el peso o la altura son menores que 0
    */

    public double calcularIMC(double peso, double altura) {
        // Validación para evitar división por cero o valores negativos
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("El peso y la altura deben ser mayores que 0.");
        }

        // Fórmula para calcular el IMC
        double imc = peso / (altura * altura);

        return imc;
    }
}
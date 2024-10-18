package modelos;
/**
 * Clase que contiene el método para realizar la operación de división.
 */
public class Division {
    /**
     * Realiza la operación de división entre dos números enteros.
     * Si el denominador es cero, lanza una excepción personalizada.
     * 
     * @param numerador El numerador de la división.
     * @param denominador El denominador de la división.
     * @return El resultado de la división como un número de tipo double.
     * @throws DivisionPorCeroException Si el denominador es cero.
     */
    public static double dividir(int numerador, int denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return (double) numerador / denominador;
    }
}

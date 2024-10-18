package modelos;
/**
 * Excepción personalizada que se lanza cuando se intenta dividir por cero.
 */
public class DivisionPorCeroException extends Exception {
    /**
     * Constructor de la excepción que recibe un mensaje de error.
     * 
     * @param mensaje El mensaje de error asociado con la excepción.
     */
    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }
}


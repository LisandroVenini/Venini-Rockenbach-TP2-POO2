package modelos;
/**
 * Escenario 2: Método obsoleto con sugerencia de uso alternativo
 *  Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.
 */
public class Obsoleto{
    
    /**
     * @deprecated Este método ha quedado obsoleto. Usa {@link #nuevoMetodo()} en su lugar.
     */
    @Deprecated
    public void viejoMetodo() {
        System.out.println("Este método es obsoleto.");
    }

    public void nuevoMetodo() {
        System.out.println("Este es el método nuevo.");
    }
}

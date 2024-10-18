/**
 * Clase que representa a un cliente.
 */
public class Cliente {
    private int idCliente;
    private String nombre;
     /**
     * Constructor de la clase Cliente.
     * 
     * @param idCliente ID único del cliente
     * @param nombre    Nombre del cliente
     */
    public Cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }
    /**
     * Muestra la información del cliente.
     */
    public void obtenerInfoCliente() {
        System.out.println("Cliente ID: " + idCliente + ", Nombre: " + nombre);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/**
 * Clase que representa un avión.
 */
public class Avion {
    private String modelo;
    private int capacidadMaxima;
    private String aerolinea;
    /**
     * Constructor de la clase Avion.
     * 
     * @param modelo          Modelo del avión
     * @param capacidadMaxima Capacidad máxima del avión
     * @param aerolinea       Aerolínea a la que pertenece el avión
     */
    public Avion(String modelo, int capacidadMaxima, String aerolinea) {
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
        this.aerolinea = aerolinea;
    }
     /**
     * Ejecuta una operación genérica en el avión.
     * 
     * @param params Parámetros de la operación
     */
    public void operation1(String params) {
        System.out.println("Ejecutando operación 1 en el avión " + modelo + " con parámetro: " + params);
    }
      /**
     * Chequeo interno en el avión (operación privada).
     * 
     * @param params Parámetros del chequeo
     */
    private void operation2(String params) {
        System.out.println("Chequeo interno en el avión " + modelo + " con parámetro: " + params);
    }
     /**
     * Reinicia los sistemas del avión (operación privada).
     */
    private void operation3() {
        System.out.println("Reiniciando sistemas del avión " + modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
}

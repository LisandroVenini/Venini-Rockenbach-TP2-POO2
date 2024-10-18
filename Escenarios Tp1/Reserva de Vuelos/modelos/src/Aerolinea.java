import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una aerolínea.
 */
public class Aerolinea {
    private int codAerolinea;
    private String nombre;
    private List<Vuelo> vuelos;
     /**
     * Constructor de la clase Aerolinea.
     * 
     * @param codAerolinea Código de la aerolínea
     * @param nombre       Nombre de la aerolínea
     */
    public Aerolinea(int codAerolinea, String nombre) {
        this.codAerolinea = codAerolinea;
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
    }
    /**
     * Registra un nuevo vuelo en la aerolínea.
     * 
     * @param vuelo Vuelo a registrar
     */
    public void registrarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        System.out.println("Vuelo " + vuelo.getNumeroVuelo() + " registrado bajo la aerolínea " + nombre);
    }

    public int getCodAerolinea() {
        return codAerolinea;
    }

    public void setCodAerolinea(int codAerolinea) {
        this.codAerolinea = codAerolinea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

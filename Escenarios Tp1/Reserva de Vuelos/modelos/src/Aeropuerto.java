/**
 * Clase que representa un aeropuerto.
 */
public class Aeropuerto {
    private String codigo;
    private String nombre;
    private String ciudad;
       /**
     * Constructor de la clase Aeropuerto.
     * 
     * @param codigo Código del aeropuerto
     * @param nombre Nombre del aeropuerto
     * @param ciudad Ciudad en la que se encuentra el aeropuerto
     */
    public Aeropuerto(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
     /**
     * Retorna la información completa del aeropuerto.
     * 
     * @return Información del aeropuerto
     */
    public String ObtenerInfo() {
        return "Aeropuerto: " + nombre + ", Ciudad: " + ciudad + ", Código: " + codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

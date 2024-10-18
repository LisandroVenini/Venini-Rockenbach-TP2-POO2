import java.util.Date;
/**
 * Clase que representa una reserva de vuelo.
 */
public class Reserva {
    private String numeroConfirmacion;
    private Date fechaReserva;
    private String asiento;
    private Vuelo vuelo;
    private Cliente cliente;
    /**
     * Constructor de la clase Reserva.
     * 
     * @param numeroConfirmacion Número de confirmación de la reserva
     * @param fechaReserva       Fecha en la que se realizó la reserva
     * @param asiento            Asiento reservado
     * @param vuelo              Vuelo asociado a la reserva
     * @param cliente            Cliente que realizó la reserva
     */
    public Reserva(String numeroConfirmacion, Date fechaReserva, String asiento, Vuelo vuelo, Cliente cliente) {
        this.numeroConfirmacion = numeroConfirmacion;
        this.fechaReserva = fechaReserva;
        this.asiento = asiento;
        this.vuelo = vuelo;
        this.cliente = cliente;
    }
     /**
     * Cancela la reserva.
     */
    public void cancelar() {
        System.out.println("Reserva número " + numeroConfirmacion + " cancelada.");
    }

    public String getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    public void setNumeroConfirmacion(String numeroConfirmacion) {
        this.numeroConfirmacion = numeroConfirmacion;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

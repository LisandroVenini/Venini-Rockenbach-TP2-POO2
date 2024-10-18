import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa un vuelo.
 */
public class Vuelo {
    private String numeroVuelo;
    private Aerolinea aerolinea;
    private Date fechaSalida;
    private Time horaSalida;
    private Date fechaLlegada;
    private Time horaLlegada;
    private Avion avion;
    private Aeropuerto aeropuertoOrig;
    private Aeropuerto aeropuertoDest;
    private List<Reserva> reservas;

     /**
     * Constructor de la clase Vuelo.
     * 
     * @param numeroVuelo      Número del vuelo
     * @param aerolinea        Aerolínea a la que pertenece el vuelo
     * @param fechaSalida      Fecha de salida del vuelo
     * @param horaSalida       Hora de salida del vuelo
     * @param fechaLlegada     Fecha de llegada del vuelo
     * @param horaLlegada      Hora de llegada del vuelo
     * @param avion            Avión asignado al vuelo
     * @param aeropuertoOrig   Aeropuerto de origen
     * @param aeropuertoDest   Aeropuerto de destino
     */
    public Vuelo(String numeroVuelo, Aerolinea aerolinea, Date fechaSalida, Time horaSalida,
                 Date fechaLlegada, Time horaLlegada, Avion avion, 
                 Aeropuerto aeropuertoOrig, Aeropuerto aeropuertoDest) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.avion = avion;
        this.aeropuertoOrig = aeropuertoOrig;
        this.aeropuertoDest = aeropuertoDest;
        this.reservas = new ArrayList<>();
    }

     /**
     * Reserva un asiento en el vuelo.
     * 
     * @param reserva Reserva a realizar en el vuelo
     */
    public void reservarAsiento(Reserva reserva) {
        if (reservas.size() < avion.getCapacidadMaxima()) {
            reservas.add(reserva);
            System.out.println("Reserva realizada para el vuelo " + numeroVuelo + " por el cliente " + reserva.getCliente().getNombre());
        } else {
            System.out.println("No hay más asientos disponibles para el vuelo " + numeroVuelo);
        }
    }

    /**
     * Cancela una reserva específica en el vuelo.
     * 
     * @param reserva Reserva a cancelar
     */
    public void cancelarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.remove(reserva);
            reserva.cancelar(); // Cancela la reserva y muestra un mensaje
            System.out.println("Reserva cancelada para el vuelo " + numeroVuelo);
        } else {
            System.out.println("La reserva no fue encontrada en el vuelo " + numeroVuelo);
        }
    }

    // Getters y Setters...
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Time getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Aeropuerto getAeropuertoOrig() {
        return aeropuertoOrig;
    }

    public void setAeropuertoOrig(Aeropuerto aeropuertoOrig) {
        this.aeropuertoOrig = aeropuertoOrig;
    }

    public Aeropuerto getAeropuertoDest() {
        return aeropuertoDest;
    }

    public void setAeropuertoDest(Aeropuerto aeropuertoDest) {
        this.aeropuertoDest = aeropuertoDest;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}

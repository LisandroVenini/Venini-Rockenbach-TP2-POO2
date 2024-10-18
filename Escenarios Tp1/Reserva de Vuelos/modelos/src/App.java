import java.sql.Time;
import java.util.Date;

public class App {
        /**
         * Punto de entrada principal de la aplicación.
         *
         * Este método de prueba crea instancias de las clases Aerolinea, Avion,
         * Aeropuerto, Vuelo, Cliente y Reserva, y realiza operaciones de
         * registro, reserva y cancelación de vuelos, y muestra información del
         * cliente y del aeropuerto.
         *
         * @param args argumentos de la línea de comandos
         * @throws Exception si ocurre un error en la ejecución del método
         */
    public static void main(String[] args) throws Exception {
        // Crear instancias de las clases
        Aerolinea aerolinea = new Aerolinea(1, "Aerolínea XYZ");
        Avion avion = new Avion("Boeing 747", 200, "Aerolínea XYZ");
        Aeropuerto aeropuertoOrig = new Aeropuerto("EZE", "Aeropuerto Internacional Ezeiza", "Buenos Aires");
        Aeropuerto aeropuertoDest = new Aeropuerto("JFK", "John F. Kennedy International Airport", "New York");
        
        Vuelo vuelo = new Vuelo("AR1234", aerolinea, new Date(), new Time(12, 30, 0),
                new Date(), new Time(18, 45, 0), avion, aeropuertoOrig, aeropuertoDest);
        
        Cliente cliente = new Cliente(101, "Juan Pérez");
        Reserva reserva = new Reserva("CONF123", new Date(), "12A", vuelo, cliente);
        
        // Registrar el vuelo
        aerolinea.registrarVuelo(vuelo);
        
        // Reservar asiento en el vuelo
        vuelo.reservarAsiento(reserva);
        
        // Cancelar la reserva
        vuelo.cancelarReserva(reserva);
        
        // Mostrar información del cliente
        cliente.obtenerInfoCliente();
        
        // Mostrar información del aeropuerto
        System.out.println(aeropuertoOrig.ObtenerInfo());
    }
}


package modelos;

import java.util.ArrayList;

public class Restaurante {

//-------------Atributos---------------
    private String nombre;
    private String ubicacion;
    private ArrayList<Mesa> mesas = new ArrayList<>();
    private ArrayList<Plato> platos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();


//-------------Constructor---------------
    public Restaurante(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

//-------------Getters---------------
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

//-------------Setters---------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

//-------------Metodos---------------
    
    /**
     * Agrega un cliente a la lista de clientes del restaurante.
     *
     * @param cliente El cliente a agregar.
     */
    public void registrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    /**
     * Agrega una mesa a la lista de mesas del restaurante.
     *
     * @param mesa La mesa a agregar.
     */
    public void registrarMesa(Mesa mesa){
        this.mesas.add(mesa);
    }


/**
 * Agrega un plato a la lista de platos del restaurante.
 *
 * @param plato El plato a agregar.
 */
    public void registrarPlato(Plato plato){
        this.platos.add(plato);
    }



}

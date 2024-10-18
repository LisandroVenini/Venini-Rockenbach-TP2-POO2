package modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    
//-------------Atributos---------------
    private int nroPedido;
    private LocalDateTime horaRealizado = LocalDateTime.now();
    private EstadoPedido estado;
    private Cliente cliente;
    private Mesa mesa;
    private ArrayList<Plato> plato= new ArrayList<>(); 

//-------------Constructor---------------
    public Pedido(int nroPedido, Cliente cliente) {
        this.nroPedido = nroPedido;
        this.estado = EstadoPedido.PENDIENTE;
        this.cliente = cliente;
    }

//-------------Getters---------------
    public int getNroPedido() {
        return nroPedido;
    }
    public LocalDateTime getHoraRealizado() {
        return horaRealizado;
    }
    public EstadoPedido getEstado() {
        return estado;
    }
    public Cliente getCliente() {
        return cliente;
    }

//-------------Setters---------------
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

//-------------Metodos----------------
    public void agregarPlato(Plato plato){
        this.plato.add(plato);
    }

    /**
     * Muestra por pantalla los nombres de los platos
     * que esten en el pedido.
     */
    public void mostrarPlatos(){
        for (int i = 0; i < plato.size(); i++) {
            System.out.println(plato.get(i).getNombre());
        }
    }

}

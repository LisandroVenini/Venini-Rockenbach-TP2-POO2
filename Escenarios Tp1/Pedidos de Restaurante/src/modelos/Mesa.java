package modelos;

import java.util.ArrayList;

public class Mesa {

//-------------Atributos---------------
    private int idMesa;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

//-------------Constructor---------------
    public Mesa(int idMesa) {
        this.idMesa = idMesa;
    }

//-------------Getters---------------

    public int getIdMesa() {
        return idMesa;
    }

//-------------Metodos----------------
    public void asignarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

/**
 * Muestra por pantalla los números de los pedidos que esten en la mesa.
 * y sus platos
 */
    public void verPedidos(){
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(pedidos.get(i).getNroPedido());
            pedidos.get(i).mostrarPlatos();
        }
    }

}
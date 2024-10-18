package modelos;

import java.util.ArrayList;

public class Cliente{

//-------------Atributos---------------
    private int id;
    private String nombre;
    ArrayList<Pedido> pedidos = new ArrayList<>();

//-------------Constructor---------------
    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

//-------------Getters---------------
    public String getNombre(){
        return nombre;
    }

//-------------Setters---------------
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

//-------------Metodos---------------
    
/**
 * se registra un pedido en la lista de pedidos
 *
 * @param pedido El pedido a agregar.
 */
    public void registrarPedido(Pedido pedido){
        pedidos.add(pedido);
    }



}
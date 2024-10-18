import modelos.*;

public class App {
    public static void main(String[] args) throws Exception {

        //Crea una instancia de la clase Restaurante
        Restaurante restaurante = new Restaurante("Restaurante1", "Calle 123");

        //Crea una instancia de la clase Cliente
        Cliente cliente1 = new Cliente(1, "Juan");
        Cliente cliente2 = new Cliente(2,"Martin");

        //Crea una instancia de la clase Mesa
        Mesa mesa = new Mesa(1);

        //Crea una instancia de la clase Plato
        Plato plato1 = new Plato("Plato 1", 1000, CategoriaPlato.ENTRADA);
        Plato plato2 = new Plato("Plato 2", 2000, CategoriaPlato.PLATO_PRINCIPAL);
        Plato plato3 = new Plato("Plato 3", 3000, CategoriaPlato.POSTRE);

        //Crea una instancia de la clase Pedido
        Pedido pedido1 = new Pedido(1, cliente1);
        pedido1.agregarPlato(plato1);
        pedido1.agregarPlato(plato2);
        pedido1.agregarPlato(plato3);
        
        pedido1.mostrarPlatos();
        
    }
}

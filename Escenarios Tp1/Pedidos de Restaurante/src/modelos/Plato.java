package modelos;

public class Plato {
//-------------Atributos----------------

private String nombre;
private double precio;
private CategoriaPlato categoria;

//-------------constructor-------------
public Plato(String nombre, double precio, CategoriaPlato categoria) {
    this.nombre = nombre;
    this.precio = precio;
    this.categoria = categoria;
}

//-------------Getters---------------
public String getNombre() {
    return nombre;
}

public double getPrecio() {
    return precio;
}

public CategoriaPlato getCategoria() {
    return categoria;
}

//-------------Setters---------------
public void setPrecio(String nombre) {
    this.nombre = nombre;
}



}
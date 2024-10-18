package modelos;

import java.util.ArrayList;

public class Usuario {

//--------------atributos-----------------
    private String nombre;
    private int dni;
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

//--------------constructor-----------------
    public Usuario(){

    }
    public Usuario(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

//--------------Getters-----------------    
    public String getNombre(){  
        return nombre;
    }

    public int getDNi(){
        return dni;
    }

    public ArrayList<Prestamo> getPrestamos(){
        return prestamos;
    }

//--------------Setters-----------------    
    public void setNombre(String nombre){ 
        this.nombre = nombre;
    }

//--------------Metodos-----------------

    /**
     * Genera un prestamo para el usuario y lo agrega a la lista de prestamos del usuario.
     * @param libro El libro prestado.
     */
    public void generarPrestamo(Libro libro){
        Prestamo prestamo = new Prestamo(libro, this);
        prestamos.add(prestamo);
    }
    /**
     * Finaliza un prestamo y lo elimina de la lista de prestamos del usuario.
     * @param prestamo El prestamo a finalizar.
     */
    public void finalizarPrestamo(Prestamo prestamo){
        prestamo.finalizarPrestamo();
        prestamos.remove(prestamo);

    }
}

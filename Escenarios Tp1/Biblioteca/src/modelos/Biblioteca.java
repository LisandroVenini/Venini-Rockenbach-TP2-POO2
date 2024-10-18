package modelos;

import java.util.ArrayList; 
public class Biblioteca {

//--------------Atributos--------------
    private String nombre;
    private String ubicacion;
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    
//--------------Constructor--------------
    public Biblioteca() {
    }

    public Biblioteca(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

//--------------Getters--------------

    public String getNombre(){
        return nombre;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public ArrayList<Libro> getLibros(){
        return libros;
    }

    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }

//--------------Setters--------------

    public void setNombre(String nombre){
        this.nombre = nombre;
    }    

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
//--------------Metodos--------------

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }   

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }

    public void eliminarUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

}

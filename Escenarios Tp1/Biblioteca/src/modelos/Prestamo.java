package modelos;

import java.time.LocalDateTime;

public class Prestamo {
    
//--------------atributos-----------------
    private LocalDateTime fechaPrestamo = LocalDateTime.now();
    private LocalDateTime fechaDevolucion;
    private Libro libro;
    private Usuario usuario;

//--------------constructor-----------------
    
    public Prestamo(){
    }

    public Prestamo(Libro libro, Usuario usuario){
        this.libro = libro;
        this.usuario = usuario;
        this.fechaDevolucion = calcularDevolucion();
        this.libro.setEstado(EstadoLibro.PRESTADO);
        this.libro.setPrestamo(this);
    }

//--------------getters-----------------
    public Libro getLibro() {
        return libro;
    }  
    public Usuario getUsuario() {
        return usuario;
    }  
    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }   
    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

//--------------metodos-----------------
public LocalDateTime calcularDevolucion(){
    return fechaPrestamo.plusDays(7);
}

public void finalizarPrestamo(){
    this.libro.setEstado(EstadoLibro.DISPONIBLE);
}
}
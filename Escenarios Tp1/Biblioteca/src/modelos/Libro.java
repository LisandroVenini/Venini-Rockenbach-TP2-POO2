package modelos;

public class Libro {

//--------------Atributos-----------------
    private String titulo;
    private String autor;
    private String nroPaginas;
    private EstadoLibro estado;
    private Prestamo prestamo;

//--------------Constructor--------------
    public Libro(){
    }

    public Libro(String titulo, String autor, String nroPaginas, EstadoLibro estado){
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.estado = estado;
    }

//--------------Getters-----------------
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getNroPaginas(){
        return nroPaginas;
    }

    public EstadoLibro getEstado(){ 
        return estado;
    }

//--------------Setters-----------------
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){ 
        this.autor = autor;
    }

    public void setPaginas(String nroPaginas){ 
        this.nroPaginas = nroPaginas;
    }

    public void setEstado(EstadoLibro estado){ 
        this.estado = estado;
    }

    public void setPrestamo(Prestamo prestamo){
        this.prestamo = prestamo;
    }

//--------------Metodos-----------------
    public boolean tienePrestamo(){
        if (this.prestamo != null){
            return true;
        }else{
            return false;
        }
    }
    




}
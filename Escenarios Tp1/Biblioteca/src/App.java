import modelos.*;
public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca("Nose", "Calle 123");
        
        Libro libro1 = new Libro("Libro 1", "Autor 1", "100", EstadoLibro.DISPONIBLE);
        Libro libro2 = new Libro("Libro 2", "Autor 2", "200", EstadoLibro.DISPONIBLE);
        Libro libro3 = new Libro("Libro 3", "Autor 3", "300", EstadoLibro.DISPONIBLE);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        
        Usuario usuario1 = new Usuario("Usuario 1", 12345678);
        Usuario usuario2 = new Usuario("Usuario 2", 87654321);
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);
        
        usuario1.generarPrestamo(libro1);
        usuario1.generarPrestamo(libro2);
        usuario1.generarPrestamo(libro3);
        
        for (Prestamo prestamo : usuario1.getPrestamos()) {
            System.out.println(prestamo.getLibro().getTitulo());
        }

        usuario1.finalizarPrestamo(usuario1.getPrestamos().get(0));

        for (Prestamo prestamo : usuario1.getPrestamos()) {
            System.out.println(prestamo.getLibro().getTitulo());
        }
    }
}

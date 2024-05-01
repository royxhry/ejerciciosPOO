public class MainLibro {
    public static void main(String[] args) {
        // Crear un objeto Libro usando el constructor vacío
        Libro libro1 = new Libro();
        // Cargar los detalles del libro usando el método cargarLibro
        libro1.cargarLibro();
        // Mostrar los detalles del libro usando el método informarDetalles
        System.out.println("Detalles del libro:");
        libro1.informarDetalles();
    }
}
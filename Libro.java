import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    // Constructor con todos los atributos pasados por parámetro
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    // Constructor vacío
    public Libro() {
        // No hace nada, deja los atributos en sus valores por defecto
    }
    
    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro:");
        ISBN = scanner.nextLine();
        System.out.println("Ingrese el título del libro:");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        autor = scanner.nextLine();
        System.out.println("Ingrese el número de páginas del libro:");
        numeroPaginas = scanner.nextInt();
    }
    
    // Método para informar los detalles del libro
    public void informarDetalles() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}

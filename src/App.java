
import models.Book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {
        List<Book> books = generateBooks();

        System.out.println("\n================= TODOS LOS LIBROS =================\n");
        books.forEach(System.out::println);

        System.out.println("\n============ LIBROS CON PRECIO > $50 ==============\n");
        books.stream()
             .filter(book -> book.getPrice() > 50)
             .forEach(System.out::println);

        System.out.println("\n=========== TÍTULOS EN MAYÚSCULAS ===========\n");
        books.stream()
             .map(book -> book.getTitle().toUpperCase())
             .forEach(System.out::println);

        System.out.println("\n=========== LIBROS BARATOS (< $50) ===========\n");
        books.stream()
             .filter(book -> book.getPrice() < 50)
             .forEach(System.out::println);

        System.out.println("\n=========== PRECIO TOTAL DE TODOS LOS LIBROS ===========\n");
        double total = books.stream()
                            .map(Book::getPrice)
                            .reduce(0.0, Double::sum);
        System.out.println("Total: $" + total);

        System.out.println("\n=========== ¿HAY LIBRO DE ROBERT C. MARTIN? ===========\n");
        boolean existe = books.stream()
                              .anyMatch(book -> book.getAuthor().equalsIgnoreCase("Robert C. Martin"));
        System.out.println("¿Hay libro de Robert C. Martin? " + existe);

        System.out.println("\n=========== TÍTULOS ÚNICOS (sin duplicados) ===========\n");
        books.stream()
             .map(Book::getTitle)
             .distinct()
             .forEach(System.out::println);

        System.out.println("\n=========== PRIMEROS 2 LIBROS ===========\n");
        books.stream()
             .limit(2)
             .forEach(System.out::println);

        System.out.println("\n=========== OMITIR LOS 2 PRIMEROS LIBROS ===========\n");
        books.stream()
             .skip(2)
             .forEach(System.out::println);

        System.out.println("\n=========== ORDENADOS POR PRECIO (ASCENDENTE) ===========\n");
        books.stream()
             .sorted(Comparator.comparing(Book::getPrice))
             .forEach(System.out::println);

        System.out.println("\n=========== RECOMENDACIONES ===========\n");
        List<String> recomendaciones = books.stream()
                .filter(book -> book.getPrice() < 60)
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .map(Book::getTitle)
                .collect(Collectors.toList());

        recomendaciones.forEach(System.out::println);

        mostrarEvaluacion();
    }

    private static void mostrarEvaluacion() {
        System.out.println("\n================ PREGUNTAS RÁPIDAS ================\n");

        System.out.println("1. ¿Qué operador usarías para transformar una lista de títulos a mayúsculas?");
        System.out.println("→ Respuesta: map()");
        System.out.println("  Ejemplo:");
        System.out.println("  books.stream()");
        System.out.println("       .map(book -> book.getTitle().toUpperCase())");
        System.out.println("       .forEach(System.out::println);");

        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("2. ¿Cómo verificarías si todos los libros cuestan menos de $100?");
        System.out.println("→ Respuesta:");
        System.out.println("  boolean todosBaratos = books.stream()");
        System.out.println("                               .allMatch(book -> book.getPrice() < 100);");

        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("3. Escribe una expresión lambda que retorne true si el autor es \"Gabriel García Márquez\"");
        System.out.println("→ Respuesta:");
        System.out.println("  (book) -> book.getAuthor().equals(\"Gabriel García Márquez\")");

        System.out.println("\n===============================================================\n");
    }

    public static List<Book> generateBooks() {
        return Arrays.asList(
            new Book("Clean Code", "Robert C. Martin", 55.0),
            new Book("Effective Java", "Joshua Bloch", 70.0),
            new Book("Java Concurrency in Practice", "Brian Goetz", 60.0),
            new Book("Cien años de soledad", "Gabriel García Márquez", 45.5),
            new Book("El Quijote", "Cervantes", 39.99),
            new Book("The Pragmatic Programmer", "Andy Hunt", 65.0),
            new Book("Design Patterns", "Erich Gamma", 58.0),
            new Book("Refactoring", "Martin Fowler", 62.0),
            new Book("Head First Java", "Kathy Sierra", 48.0),
            new Book("Crónica de una muerte anunciada", "Gabriel García Márquez", 35.0),
            new Book("1984", "George Orwell", 32.0),
            new Book("Rebelión en la granja", "George Orwell", 30.0),
            new Book("Padre Rico, Padre Pobre", "Robert Kiyosaki", 29.0),
            new Book("Piense y hágase rico", "Napoleon Hill", 34.0),
            new Book("Los 7 hábitos de la gente altamente efectiva", "Stephen Covey", 52.0),
            new Book("The Mythical Man-Month", "Frederick P. Brooks", 46.0),
            new Book("Domain-Driven Design", "Eric Evans", 68.0),
            new Book("Code Complete", "Steve McConnell", 59.0),
            new Book("Thinking in Java", "Bruce Eckel", 50.0),
            new Book("Java: The Complete Reference", "Herbert Schildt", 64.0),
            new Book("Los juegos del hambre", "Suzanne Collins", 28.0),
            new Book("En llamas", "Suzanne Collins", 30.0),
            new Book("Sinsajo", "Suzanne Collins", 33.0),
            new Book("El alquimista", "Paulo Coelho", 38.0),
            new Book("Veronika decide morir", "Paulo Coelho", 41.0),
            new Book("11 minutos", "Paulo Coelho", 36.0),
            new Book("El código Da Vinci", "Dan Brown", 44.0),
            new Book("Ángeles y demonios", "Dan Brown", 43.0),
            new Book("Inferno", "Dan Brown", 42.0),
            new Book("El símbolo perdido", "Dan Brown", 45.0),
            new Book("Harry Potter y la piedra filosofal", "J.K. Rowling", 37.0),
            new Book("Harry Potter y la cámara secreta", "J.K. Rowling", 39.0),
            new Book("Harry Potter y el prisionero de Azkaban", "J.K. Rowling", 40.0),
            new Book("Harry Potter y el cáliz de fuego", "J.K. Rowling", 42.0),
            new Book("Harry Potter y la Orden del Fénix", "J.K. Rowling", 45.0),
            new Book("Harry Potter y el misterio del príncipe", "J.K. Rowling", 43.0),
            new Book("Harry Potter y las Reliquias de la Muerte", "J.K. Rowling", 46.0),
            new Book("Las aventuras de Sherlock Holmes", "Arthur Conan Doyle", 35.0),
            new Book("Orgullo y prejuicio", "Jane Austen", 34.0),
            new Book("Drácula", "Bram Stoker", 36.0),
            new Book("Clean Code", "Robert C. Martin", 55.0)
        );
    }
}

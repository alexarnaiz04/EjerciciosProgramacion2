import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ejercicio14 {
    public static void main(String[] args) {
        // 1. Generar un stream de números mediante el método estático of de la clase IntStream.
        IntStream apartado1 = IntStream.of(1, 2, 3, 4, 5);
        System.out.println("Generar un stream de números mediante el método estático of de la clase IntStream.");
        apartado1.forEach(System.out::println);

        // 2. Generar un stream de números mediante el método estático range de la clase IntStream.
        IntStream apartado2 = IntStream.range(1, 9); 
        System.out.println("Generar un stream de números mediante el método estático range de\r\n" + "la clase IntStream.");
        apartado2.forEach(System.out::println);

        // 3. Generar un stream de números mediante el método estático iterate de la clase IntStream.
        System.out.println("Generar un stream utilizando el método estático iterate de la clase IntStream:");
        IntStream stream3 = IntStream.iterate(2, n -> n + 1).limit(10); // Comienza en 1, incrementa en 1, y toma 5 elementos
        stream3.forEach(System.out::println);
        System.out.println();

        // 4. Generar un stream de números aleatorios utilizando el método doubles de la clase Random.
        System.out.println("Generar un stream de números aleatorios utilizando el método doubles de la clase Random:");
        Random random = new Random();
        DoubleStream stream4 = random.doubles(5); // Genera 5 números aleatorios
        stream4.forEach(System.out::println);
    }
}

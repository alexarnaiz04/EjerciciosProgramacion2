import java.util.Scanner;
import java.util.function.Function;

public class lambdaListas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduzca a continuacion el límite inferior:");
            double limiteInferior = scanner.nextDouble();

            System.out.println("Introduzca a continuacion el límite superior:");
            double limiteSuperior = scanner.nextDouble();

            System.out.println("Ingrese el paso:");
            double paso = scanner.nextDouble();

            double integral = calcularIntegral(limiteInferior, limiteSuperior, paso, x -> Math.pow(Math.exp(x), 2));

            System.out.println("La integral de e^x^2 desde el limite " + limiteInferior + " hasta el limite " + limiteSuperior + " con un paso de " + paso + " es: " + integral);
        }
    }

    public static double calcularIntegral(double a, double b, double h, Function<Double, Double> funcion) {
        double resultado = 0;
        for (double x = a; x < b; x += h) {
            resultado += funcion.apply(x) * h;
        }
        return resultado;
    }
}
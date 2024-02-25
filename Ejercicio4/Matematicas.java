public class Matematicas {
    public static double integralEXCuadrado(double limInf, double limSup, double h) {
        return integralEXCuadradoRecursivo(limInf, limSup, h, limInf);
    }

    private static double integralEXCuadradoRecursivo(double limInf, double limSup, double h, double x) {
        if (x >= limSup) {
            return 0; 
        } else {
            double fx = Math.exp(x * x); // Calculo
            double areaRectangulo = fx * h; 
            return areaRectangulo + integralEXCuadradoRecursivo(limInf, limSup, h, x + h);
        }
    }

    public static void main(String[] args) {
        double integral = integralEXCuadrado(0, 1, 0.1);
        System.out.println("Resultado de la integral: " + integral);
    }
}

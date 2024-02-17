package Aplicacion;

import java.util.Arrays;
import java.util.List;

import Dominio.OperacionesBucles;

public class Principal {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de los primeros " + n + " numeros naturales es: " + OperacionesBucles.sumaNaturales(n));

        int m = 4;
        System.out.println("El factorial de " + m + " es: " + OperacionesBucles.factorial(m));

        int base = 2;
        int exponente = 3;
        System.out.println(base + " elevado a la " + exponente + " es: " + OperacionesBucles.potencia(base, exponente));

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("La suma de los numeros " + numeros + " es: " + OperacionesBucles.sumaLista(numeros));
        System.out.println("La media de los numeros " + numeros + " es: " + OperacionesBucles.mediaLista(numeros));
        System.out.println(
                "La desviacion tipica de los numeros " + numeros + " es: " + OperacionesBucles.desviacionTipica(numeros));

        int p = 9;
        System.out.println("La suma de los primeros numeros pares hasta " + p + " es: " + OperacionesBucles.sumaPares(p));

        List<Integer> numerosPares = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                "La suma de los numeros pares de " + numerosPares + " es: " + OperacionesBucles.sumaParesLista(numerosPares));
        System.out.println("La lista de numeros pares hasta " + p + " es: " + OperacionesBucles.listaPares(p));

        List<Integer> listaNumeros = Arrays.asList(1, 2, 6, 11);
        System.out.println(
                "La lista de numeros pares de " + listaNumeros + " es: " + OperacionesBucles.obtenerListaPares(listaNumeros));

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        System.out.println("El producto escalar de " + lista1 + " y " + lista2 + " es: "
                + OperacionesBucles.calcularProductoEscalar(lista1, lista2));
    }
}
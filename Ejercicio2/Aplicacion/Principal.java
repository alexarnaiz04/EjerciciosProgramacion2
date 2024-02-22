package Aplicacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.OperacionesRecursivas;

public class Principal {
    public static void main(String[] args) {
        int resultadoSuma = OperacionesRecursivas.sumaRecursiva(5);
        System.out.println("1. La suma de los números desde 0 hasta 5 es: " + resultadoSuma);

        long resultadoFactorial = OperacionesRecursivas.factorialRecursivo(5);
        System.out.println("2. El factorial de 5 es: " + resultadoFactorial);

        long resultadoPotencia = OperacionesRecursivas.potenciaRecursiva(2, 5);
        System.out.println("3. 2 elevado a la 5 es: " + resultadoPotencia);

        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        int resultadoSumaLista = OperacionesRecursivas.sumaListaRecursiva(lista);
        System.out.println("4. La suma de los elementos de la lista es: " + resultadoSumaLista);

        double resultadoMedia = OperacionesRecursivas.mediaRecursiva(lista);
        System.out.println("5. La media aritmética de la lista es: " + resultadoMedia);

        double resultadoDesviacion = OperacionesRecursivas.desviacionTipicaRecursiva(lista);
        System.out.println("6. La desviación típica de la lista es: " + resultadoDesviacion);

        int resultadoSumaPares = OperacionesRecursivas.sumaParesRecursiva(9);
        System.out.println("7. La suma de los primeros números pares hasta 9 es: " + resultadoSumaPares);

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        int resultadoSumaParesLista = OperacionesRecursivas.sumaParesListaRecursiva(listaNumeros);
        System.out.println("8. La suma de los elementos pares de la lista es: " + resultadoSumaParesLista);

        List<Integer> listaNumeros2 = new ArrayList<>();
        listaNumeros2.add(1);
        listaNumeros2.add(2);
        listaNumeros2.add(6);
        listaNumeros2.add(11);
        List<Integer> listaPares = OperacionesRecursivas.obtenerListaPares(listaNumeros2);
        System.out.println("9. La lista de los números pares de la lista es: " + listaPares);

        List<Integer> listaParesHastaNueve = OperacionesRecursivas.listaParesRecursiva(9);
        System.out.println("10. La lista de los primeros números pares hasta 9 es: " + listaParesHastaNueve);

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        int productoEscalar = OperacionesRecursivas.calcularProductoEscalar(lista1, lista2);
        System.out.println("11. El producto escalar de las listas es: " + productoEscalar);
    }
}
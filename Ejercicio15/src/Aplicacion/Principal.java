package Aplicacion;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        System.out.println("1. Suma hasta 9: " + Dominio.Mates.sumahasta(8));
        System.out.println("2. Factorial de 6: " + Dominio.Mates.factorial(4));
        System.out.println("3. Potencia de 2^3: " + Dominio.Mates.potencia(5, 3));

        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 12);
        System.out.println("4. Suma de la lista: " + Dominio.Mates.sumaLista(numeros));
        System.out.println("5. Media de la lista: " + Dominio.Mates.media(numeros));
        System.out.println("6. Desviación típica de la lista: " + Dominio.Mates.desviacionTipica(numeros));
        System.out.println("7. Suma de los primeros pares hasta 9: " + Dominio.Mates.sumaPares(9));

        List<Integer> numerosPares = Arrays.asList(1, 3, 5, 7);
        System.out.println("8. Suma de los pares en la lista: " + Dominio.Mates.sumaParesLista(numerosPares));

        List<Integer> listaInicial = Arrays.asList(3, 6, 15, 21);
        System.out.println("9. Lista de pares de la lista inicial: " + Dominio.Mates.obtenerListaPares(listaInicial));
        System.out.println("10. Lista de pares hasta 9: " + Dominio.Mates.listaPares(9));

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        System.out
                .println("11. Producto escalar de las listas: " + Dominio.Mates.calcularProductoEscalar(lista1, lista2));

        
    }
}
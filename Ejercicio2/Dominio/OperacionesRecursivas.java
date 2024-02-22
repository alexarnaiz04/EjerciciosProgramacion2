package Dominio;

import java.util.ArrayList;
import java.util.List;

public class OperacionesRecursivas {
    // 1. La suma 0 + 1 + 2 + ... + n.
    public static int sumaRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }

    // 2. El factorial de un número.
    public static long factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    // 3. La potencia n-ésima de un número natural.
    public static long potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potenciaRecursiva(base, exponente - 1);
        }
    }

    // 4. La suma de los elementos de una lista de números.
    public static int sumaListaRecursiva(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            int primerElemento = lista.get(0);
            lista.remove(0);
            return primerElemento + sumaListaRecursiva(lista);
        }
    }

    // 5. La media aritmética de una lista de números.
    public static double mediaRecursiva(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return sumaListaRecursiva(lista) / (double) lista.size();
        }
    }

    // 6. La desviación típica de una lista de números.
    public static double desviacionTipicaRecursiva(List<Integer> lista) {
        double media = mediaRecursiva(lista);
        double sumaCuadrados = 0;
        for (int num : lista) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / lista.size());
    }

    // 7. La suma de los primeros números pares hasta n asumiendo n ≥ 2.
    public static int sumaParesRecursiva(int n) {
        if (n < 2) {
            return 0;
        } else {
            return n + sumaParesRecursiva(n - 2);
        }
    }

    // 8. La suma de los elementos pares de una lista de enteros.
    public static int sumaParesListaRecursiva(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            int primerElemento = lista.get(0);
            if (primerElemento % 2 == 0) {
                lista.remove(0);
                return primerElemento + sumaParesListaRecursiva(lista);
            } else {
                lista.remove(0);
                return sumaParesListaRecursiva(lista);
            }
        }
    }

    // 9. Dada una lista de números naturales mayores o iguales que 2, obtiene otra lista con los números pares.
    public static List<Integer> obtenerListaPares(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();
        if (!lista.isEmpty()) {
            int primerElemento = lista.get(0);
            if (primerElemento >= 2 && primerElemento % 2 == 0) {
                pares.add(primerElemento);
            }
            lista.remove(0);
            pares.addAll(obtenerListaPares(lista));
        }
        return pares;
    }

    // 10. La lista de los primeros números pares hasta n asumiendo n ≥ 2.
    public static List<Integer> listaParesRecursiva(int n) {
        List<Integer> pares = new ArrayList<>();
        if (n >= 2) {
            if (n % 2 == 0) {
                pares.add(n);
            }
            pares.addAll(listaParesRecursiva(n - 1));
        }
        return pares;
    }

    // 11. Producto escalar de dos listas de números no vacías y del mismo tamaño.
    public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
        if (lista1.isEmpty() || lista2.isEmpty()) {
            return 0;
        } else {
            return (lista1.get(0) * lista2.get(0)) + calcularProductoEscalar(lista1.subList(1, lista1.size()), lista2.subList(1, lista2.size()));
        }
    }
}
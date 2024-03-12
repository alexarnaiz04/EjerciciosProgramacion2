public static boolean buscar(int e, int[] array) {
    return buscarRecursivo(e, array, 0, array.length - 1);
}

private static boolean buscarRecursivo(int e, int[] array, int inicio, int fin) {
    if (inicio > fin) {
        return false;
    }
    
    int medio = encontrarMedio(inicio, fin);
    
    if (array[medio] == e) {
        return true;
    } else if (array[medio] < e) {
        return buscarRecursivo(e, array, medio + 1, fin);
    } else {
        return buscarRecursivo(e, array, inicio, medio - 1);
    }
}

private static int encontrarMedio(int inicio, int fin) {
    return inicio + (fin - inicio) / 2;
}

/*
La complejidad en el peor caso, en cada paso del algoritmo se reduce el rango de búsqueda a la mitad, por lo que la complejidad temporal 
en el peor caso es logarítmica respecto al tamaño del array. Por lo tanto, la complejidad en el peor caso es O(log n), donde n es el 
número de elementos en el array. 
*/
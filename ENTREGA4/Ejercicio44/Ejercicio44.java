public static boolean buscar(int e, int[] array) {

    if (array[0] == e || array[array.length - 1] == e) {
        return true;
    }
    
    for (int i = 1; i < array.length - 1; i++) {
        if (array[i] == e) {
            return true; 
        }
    }
    
    return false; 
}

/*
Peor caso: O(n)
Mejor caso: O(1)
Caso promedio: O(n) 
*/

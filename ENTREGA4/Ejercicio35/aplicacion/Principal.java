package aplicacion;

import dominio.SumaNNumeros;

public class Principal {

    public static void main(String[] args) {
        int n = 8; 
        SumaNNumeros utils = new SumaNNumeros();
        System.out.println("Suma recursiva de los primeros " + n + " números naturales: " + utils.sumaRecursiva(n));
        System.out.println("Suma iterativa de los primeros " + n + " números naturales: " + utils.sumaIterativa(n));
    }
}
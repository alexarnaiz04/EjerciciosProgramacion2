public class Principal {

    public static int sumaCodigos(String equipo) {
        if (equipo.isEmpty()) {
            return 0;
        } else {
            int codigo = (int) equipo.charAt(0);
            return codigo + sumaCodigos(equipo.substring(1));
        }
    }

    public static void main(String[] args) {
        String nombreEquipo = "Real Madrid"; 
        int suma = sumaCodigos(nombreEquipo);
        System.out.println("La suma de los códigos ASCII del nombre del equipo es: " + suma);
    }
}
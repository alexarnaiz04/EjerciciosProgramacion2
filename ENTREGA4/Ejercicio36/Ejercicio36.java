public class Ejercicio36 {
    public static void main(String[] args) {
        int[] array = new int[3334]; 

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


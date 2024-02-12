public class Ejercicio3 {
    public static void main(String[] args) {
        int vector1[] = { 5, 7, 9, 3 };
        int vector2[] = { 8, 6, 4, 1 };
        int suma = 0;

        for (int i = 0; i <= vector1.length - 1; i++) {
            suma = vector1[i] + vector2[i];
            System.out.println(suma + " ");
        }
    }
}

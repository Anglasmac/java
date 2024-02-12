
//Eliminación de Duplicados: Crea un programa que elimine los elementos duplicados de un vector.
import java.util.Arrays;

public class Ejercicio7 {

    public static int[] eliminarDuplicados(int[] vector) {
        // Primero ordenamos el vector para agrupar los elementos duplicados
        Arrays.sort(vector);

        // Creamos un nuevo vector para almacenar los elementos únicos
        int[] resultado = new int[vector.length];
        int anterior = vector[0];
        resultado[0] = anterior;
        int j = 1;

        // Iteramos sobre el vector para identificar y almacenar los elementos únicos
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] != anterior) {
                resultado[j] = vector[i];
                anterior = vector[i];
                j++;
            }
        }

        // Creamos un nuevo vector del tamaño correcto y copiamos los elementos únicos
        return Arrays.copyOf(resultado, j);
    }

    public static void main(String[] args) {
        int[] vectorOriginal = { 1, 2, 3, 4, 1, 2, 5, 6, 3, 7, 8, 9, 9 };
        int[] vectorSinDuplicados = eliminarDuplicados(vectorOriginal);

        System.out.println("Vector original: " + Arrays.toString(vectorOriginal));
        System.out.println("Vector sin duplicados: " + Arrays.toString(vectorSinDuplicados));
    }
}
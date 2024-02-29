//Ordenamiento de Vectores: Implementa un programa que ordene un vector en orden ascendente o descendente.

public class Ejercicio10 {

    public static void ordenarSeleccion(int[] vector, boolean ascendente) {
        for (int i = 0; i < vector.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (ascendente) {
                    if (vector[j] < vector[indiceMinimo]) {
                        indiceMinimo = j;
                    }
                } else {
                    if (vector[j] > vector[indiceMinimo]) {
                        indiceMinimo = j;
                    }
                }
            }

            int temp = vector[i];
            vector[i] = vector[indiceMinimo];
            vector[indiceMinimo] = temp;
        }
    }
}

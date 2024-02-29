//Búsqueda de Elemento: Escribe un programa que busque la posición de un elemento dado en un vector.
public class Ejercicio9 {

    public static void main(String[] args) {
        int[] vector = { 1, 3, 5, 7, 9 };
        int elemento = 5;

        int posicion = buscarPosicionElemento(vector, elemento);

        if (posicion == -1) {
            System.out.println("El elemento no se encuentra en el vector");
        } else {
            System.out.println("El elemento se encuentra en la posición " + posicion);
        }
    }

    private static int buscarPosicionElemento(int[] vector, int elemento) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}
//Inversión de Vectores: Implementa un programa que invierta el orden de los elementos en un vector
public class Ejercicio5 {
    public static void main(String[] args) {
        int vector1[] = { 4, 5, 7, 8 };
        int vector2[] = new int[vector1.length];
        int pos = vector1.length - 1;
        System.out.println("arreglo original");
        for (int i = 0; i < vector1.length; i++) {

            System.out.println(vector1[i]);
        }
        for (int i = 0; i < vector1.length; i++) {

            vector2[i] = vector1[pos];
            pos--;
        }
        System.out.println(" " + "arreglo inverso");

        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector2[i]);

        }

    }
}

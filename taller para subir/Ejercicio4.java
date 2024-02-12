//Minimo y maximo: Desarrolla un programa que encuentre el valor minimo y maximo en un vector dado
public class Ejercicio4 {
    public static void main(String[] args) {
        int vector1[] = { 7, 8, 2, 3 };
        int maximo = 0, minimo = 0;
        System.out.println("valor maximo");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("");
        }
        maximo = minimo = vector1[0];
        for (int i = 0; i < vector1.length; i++) {
            if (maximo < vector1[i]) {

                maximo = vector1[i];

            }
            if (minimo > vector1[i]) {
                minimo = vector1[i];
            }
        }
        System.out.println("valor maximo" + maximo);
        System.out.println("valor minimo" + minimo);

    }
}
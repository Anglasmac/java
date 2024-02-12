//Hacer un programa que ingrese en un vector de 10 posiciones los multiplos de 3, se debe imprimir el vector

public class Ejercicio1 {
    public static void main(String[] args) {
        int num[];
        num = new int[10];
        int contador = 3;
        System.out.println();
        for (int i = 0; i <= num.length - 1; i++) {
            num[i] = contador;
            contador = contador + 3;

        }
        for (int j = 0; j <= num.length - 1; j++) {
            System.out.println(num[j] + "");
        }
    }

}

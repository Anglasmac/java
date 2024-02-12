//Contador de Elementos Pares: Escribe un programa que cuente y muestre la cantidad de números pares en un vector.
public class Ejercicio6 {
    public static void main(String[] args) {
        int numeros[] = { 2, 3, 4, 7 };
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cont = cont + 1;

            }

        }
        System.out.println("numeros pares" + cont);

    }

}

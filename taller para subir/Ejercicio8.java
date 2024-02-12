//Promedio y Desviación Estándar: Desarrolla un programa que calcule el promedio de un vector de números.
public class Ejercicio8 {
    public static void main(String[] args) {
        int numeros[] = { 8, 9, 5, 6 };
        double suma = 0, promedio;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        promedio = suma / numeros.length;
        System.out.println("el promedio del arreglo es" + promedio);

    }
}

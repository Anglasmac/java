//Hacer un programa que pida ingresar 5 numeros por teclado y almacenarlo en un vector con su valor elevado 
//al cuadrado 

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[]; num = new int[4];
        System.out.println("ingresa 5 numeros");
        for(int i =0; i < num.length;i++){
            System.out.println("Numero"+(i+1)+":");
            num[i]=scanner.nextInt();
        } 
        for(int i =0; i < num.length;i++){
            num[i] = num[i]*num[i];

        }
        System.out.println("Los numeros elevados l cuadrado son");
        for(int i =0; i < num.length;i++){
            System.out.println(num[i]);
        }
        scanner.close();

    }
    

}

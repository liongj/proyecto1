package Tarea;

import java.util.Scanner;

public class Promedio {
	
	public static double promedioDeLista(int[] listaNumeros) {
        if (listaNumeros.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int num : listaNumeros) {
            suma += num;
        }
        return (double) suma / listaNumeros.length;
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números:");
        int cantidad = scanner.nextInt();
        int[] listaNumeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            listaNumeros[i] = scanner.nextInt();
        }
        double resultado = promedioDeLista(listaNumeros);
        System.out.println("El promedio de los números ingresados es: " + resultado);
        scanner.close();


	}

}

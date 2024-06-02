package Tarea;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento {
	public static int[] ordenarLista(int[] lista) {
        Arrays.sort(lista);
        return lista;
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
	        int[] listaOrdenada = ordenarLista(listaNumeros);
	        System.out.println("La lista ordenada es: " + Arrays.toString(listaOrdenada));
	        scanner.close();
	    }
	}



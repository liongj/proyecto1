package Tarea;

import java.util.Scanner;

public class Factorial {
	public static long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Factorial no definido para números negativos");
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un número:");
	        int numero = scanner.nextInt();
	        try {
	            long resultado = factorial(numero);
	            System.out.println("El factorial de " + numero + " es: " + resultado);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	        scanner.close();
	    }

	}



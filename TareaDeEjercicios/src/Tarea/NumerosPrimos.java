package Tarea;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        int number = scanner.nextInt();

	        if (isPrimeNumber(number)) {
	            System.out.println("El número " + number + " es primo.");
	        } else {
	            System.out.println("El número " + number + " no es primo.");
	        }
	    }

	    private static boolean isPrimeNumber(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	}



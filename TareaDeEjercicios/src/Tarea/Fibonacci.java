package Tarea;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de la serie de Fibonacci a mostrar: ");
        int numTerms = scanner.nextInt();

        System.out.println("Serie de Fibonacci de " + numTerms + " términos:");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < numTerms; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
	}



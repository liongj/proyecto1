package Tarea;

import java.util.Scanner;

public class Multiplicacion {
	 public static int multiplicacionDeDosNumeros(int num1, int num2) {
	        return num1 * num2;
	    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer n�mero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo n�mero:");
        int num2 = scanner.nextInt();
        int resultado = multiplicacionDeDosNumeros(num1, num2);
        System.out.println("La multiplicaci�n de " + num1 + " y " + num2 + " es: " + resultado);
        scanner.close();

	}

}

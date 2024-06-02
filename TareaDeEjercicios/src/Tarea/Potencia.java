package Tarea;

import java.util.Scanner;

public class Potencia {
    public static double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese el exponente:");
        int exponente = scanner.nextInt();
        double resultado = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        scanner.close();	
	}

}

package Tarea;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número para mostrar su tabla de multiplicar: ");
        int number = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
	}



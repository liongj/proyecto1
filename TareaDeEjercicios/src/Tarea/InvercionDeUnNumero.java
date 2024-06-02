package Tarea;

import java.util.Scanner;

public class InvercionDeUnNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("El número invertido es: " + reversedNumber);
    }

    private static int reverseNumber(int num) {
        int reversedNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return reversedNumber;
    }
	}



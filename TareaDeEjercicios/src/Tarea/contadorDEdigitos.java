package Tarea;

import java.util.Scanner;

public class contadorDEdigitos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("El número " + number + " tiene " + digitCount + " dígitos.");
    }

    private static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
	}


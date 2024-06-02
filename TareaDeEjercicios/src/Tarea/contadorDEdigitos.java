package Tarea;

import java.util.Scanner;

public class contadorDEdigitos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un n�mero: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("El n�mero " + number + " tiene " + digitCount + " d�gitos.");
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


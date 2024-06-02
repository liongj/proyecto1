package Tarea;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("La palabra '" + word + "' es un palíndromo.");
        } else {
            System.out.println("La palabra '" + word + "' no es un palíndromo.");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
	}

}

package Tarea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MayorYmenor {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        List<Integer> numbers = new ArrayList<>();

	        System.out.println("Ingrese una lista de n�meros (ingrese 0 para terminar):");
	        while (true) {
	            int number = scanner.nextInt();
	            if (number == 0) {
	                break;
	            }
	            numbers.add(number);
	        }

	        int min = Collections.min(numbers);
	        int max = Collections.max(numbers);

	        System.out.println("El n�mero m�s peque�o es: " + min);
	        System.out.println("El n�mero m�s grande es: " + max);
	    }
	}



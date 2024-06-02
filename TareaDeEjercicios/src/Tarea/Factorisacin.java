package Tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorisacin {
	public static List<Integer> factorizar(int numero) {
        List<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factores.add(i);
                numero /= i;
            }
        }
        return factores;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para factorizar:");
        int numero = scanner.nextInt();
        List<Integer> factores = factorizar(numero);
        System.out.println("Los factores primos de " + numero + " son: " + factores);
        scanner.close();
    }
	}



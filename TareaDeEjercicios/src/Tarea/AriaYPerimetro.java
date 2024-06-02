package Tarea;

import java.util.Scanner;

public class AriaYPerimetro {
	public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double perimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura geom�trica (c�rculo, cuadrado, tri�ngulo):");
        String figura = scanner.next().toLowerCase();

        switch (figura) {
            case "c�rculo":
                System.out.println("Ingrese el radio:");
                double radio = scanner.nextDouble();
                System.out.println("�rea: " + areaCirculo(radio));
                System.out.println("Per�metro: " + perimetroCirculo(radio));
                break;
            case "cuadrado":
                System.out.println("Ingrese el lado:");
                double lado = scanner.nextDouble();
                System.out.println("�rea: " + areaCuadrado(lado));
                System.out.println("Per�metro: " + perimetroCuadrado(lado));
                break;
            case "tri�ngulo":
                System.out.println("Ingrese la base:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura:");
                double altura = scanner.nextDouble();
                System.out.println("�rea: " + areaTriangulo(base, altura));
                System.out.println("Ingrese los tres lados:");
                double lado1 = scanner.nextDouble();
                double lado2 = scanner.nextDouble();
                double lado3 = scanner.nextDouble();
                System.out.println("Per�metro: " + perimetroTriangulo(lado1, lado2, lado3));
                break;
            default:
                System.out.println("Figura no reconocida.");
                break;
        }

        scanner.close();
    }
	}



package Condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {

            int opcion;
            double num1, num2;

          

            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextDouble();

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();

	}

}

package Interativafor;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int numero;
	        int factorial = 1;

	        System.out.print("Ingrese un número: ");
	        numero = sc.nextInt();

	        for (int i = 1; i <= numero; i++) {
	            factorial = factorial * i;
	        }

	        System.out.println("El factorial de " + numero + " es: " + factorial);

	        sc.close();
	}

}

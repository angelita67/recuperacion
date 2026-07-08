package Arreglos;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		 Scanner  sc = new Scanner(System.in);

		    int[] edades = new int[5];

		 

		        for (int i = 0; i < edades.length; i++) {
		            System.out.print("Ingrese la edad " + (i + 1) + ": ");
		            edades[i] = sc.nextInt();
		        }

		    



		        int menor = edades[0];

		        for (int i = 1; i < edades.length; i++) {

		            if (edades[i] < menor) {
		                menor = edades[i];
		            }

		        }

		        System.out.println("La edad menor es: " + menor);
		        sc.close();
	}

}

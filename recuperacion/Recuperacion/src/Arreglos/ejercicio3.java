package Arreglos;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		   int pares = 0;
	        int impares = 0;
		    int[] numeros = new int[10];

		  

		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Ingrese un número: ");
		            numeros[i] = sc.nextInt();
		            
		           
		        }

			        for (int i = 0; i < numeros.length; i++) {

			            if (numeros[i] % 2 == 0) {
			                pares++;
			            } else {
			                impares++;
			            }

			        }

			        System.out.println("Cantidad de pares: " + pares);
			        System.out.println("Cantidad de impares: " + impares);
			        sc.close();
	}
		    }
	

package Controlmultiple;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  int opcion;
	        int total = 0;

	        for (int i = 1; i <= 3; i++) {

	            System.out.println("\nCompra #" + i);
	            System.out.println("1. Chocolate - $5000");
	            System.out.println("2. Vainilla - $4500");
	            System.out.println("3. Fresa - $5500");
	            System.out.println("4. Arequipe - $6000");

	            System.out.print("Seleccione una opción: ");
	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Helado: Chocolate");
	                    total = total + 5000;
	                    break;

	                case 2:
	                    System.out.println("Helado: Vainilla");
	                    total = total + 4500;
	                    break;

	                case 3:
	                    System.out.println("Helado: Fresa");
	                    total = total + 5500;
	                    break;

	                case 4:
	                    System.out.println("Helado: Arequipe");
	                    total = total + 6000;
	                    break;

	                default:
	                    System.out.println("Opción no válida.");
	                    
	            }
	        }

	        System.out.println("\nTotal a pagar: $" + total);

	        sc.close();
	}

}

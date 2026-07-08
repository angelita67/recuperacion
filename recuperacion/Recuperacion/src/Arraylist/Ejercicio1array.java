package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1array {

	public static void main(String[] args) {
		  Scanner  sc = new Scanner(System.in);

	        ArrayList <String> personas = new ArrayList<>();

	        int cantidad;

	        System.out.print("¿Cuántas personas usaron la piscina?: ");
	        cantidad = sc.nextInt();
	        sc.nextLine();

	        for (int i = 1; i <= cantidad; i++) {

	            System.out.print("Ingrese el nombre de la persona " + i + ": ");
	            personas.add(sc.nextLine());
	        }

	        System.out.println("\nPersonas que usaron la piscina:");

	        for (String persona : personas) {
	            System.out.println(persona);
	        }

	        System.out.println("\nTotal de personas: " + personas.size());

	        sc.close();

	}

}

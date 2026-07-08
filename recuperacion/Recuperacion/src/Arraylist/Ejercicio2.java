package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 Scanner  sc = new Scanner(System.in);

	        ArrayList <Double> precios = new ArrayList<>();

	        double precio;
	        double total = 0;

	        for (int i = 1; i <= 5; i++) {

	            System.out.print("Ingrese el precio del producto " + i + ": ");
	            precio = sc.nextDouble();

	            precios.add(precio);
	        }

	        for (double valor : precios) {
	            total = total + valor;
	        }

	        System.out.println("\nPrecios registrados:");

	        for (double valor : precios) {
	            System.out.println("$" + valor);
	        }

	        System.out.println("Total a pagar: $" + total);

	        sc.close();
	}

}

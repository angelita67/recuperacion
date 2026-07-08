package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);

        ArrayList <String> productos = new ArrayList<>();

        String producto;

       
        for (int i = 1; i <= 5; i++) {

            System.out.print("Ingrese el producto " + i + ": ");
            producto = sc.nextLine();

            productos.add(producto);
        }

        
        System.out.println("\nLISTA DE PRODUCTOS");

        for (int i = 0; i < productos.size(); i++) {

            System.out.println((i + 1) + ". " + productos.get(i));
        }

        sc.close();
	}

}

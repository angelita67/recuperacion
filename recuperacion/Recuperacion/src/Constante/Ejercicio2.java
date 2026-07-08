package Constante;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        String producto;
	        double precio, descuento, total;

	        System.out.print("Ingrese el nombre del producto: ");
	        producto = sc.nextLine();

	        System.out.print("Ingrese el precio del producto: ");
	        precio = sc.nextDouble();

	        descuento = precio * 0.10;
	        total = precio - descuento;

	        System.out.println("Producto: " + producto);
	        System.out.println("Descuento: $" + descuento);
	        System.out.println("Total a pagar: $" + total);

 sc.close();
	}

}

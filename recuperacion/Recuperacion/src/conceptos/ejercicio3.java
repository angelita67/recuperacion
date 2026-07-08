package conceptos;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		 Scanner  sc = new Scanner(System.in);

	        double largo;
	        double ancho;

	        System.out.print("Ingrese el largo del rectángulo: ");
	        largo = sc.nextDouble();

	        System.out.print("Ingrese el ancho del rectángulo: ");
	        ancho = sc.nextDouble();

	        double area = largo * ancho;
	        double perimetro = 2 * (largo + ancho);

	        System.out.println("Largo: " + largo);
	        System.out.println("Ancho: " + ancho);
	        System.out.println("Área: " + area);
	        System.out.println("Perímetro: " + perimetro);
	
	        sc.close();
	        
	}

}

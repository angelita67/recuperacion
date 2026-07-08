package Variables;

import java.util.Scanner;

public class Ejercicio1variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String nombre;
		int edad;
		
		System.out.println("ingrese el nombre");
		nombre = sc.nextLine();
		
		System.out.println("ingrese la edad");
		edad = sc.nextInt();
		
		System.out.println("nombre:" + nombre);
		
		System.out.println("edad:" + edad);
		
		sc.close();
	}

	

}

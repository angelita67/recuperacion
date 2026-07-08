package Variables;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int HorasTrabajadas;
		double salario ,  valorHoras;
		
	System.out.println("ingrese el nombre");
	nombre =  sc.nextLine();
	
	System.out.println("ingrese el salario");
	salario = sc.nextDouble();
	
	System.out .println("ingrese la horastrabajadas");
	HorasTrabajadas = sc.nextInt();
	
	
	System.out.println("ingrse las horasextras");
	valorHoras = sc.nextDouble();
	
	salario = HorasTrabajadas * valorHoras;
	
	System.out.println("empleado:" + nombre);
	
	System.out.println("salario: $" + salario);
	
	
	
	sc.close();
	
	}

}

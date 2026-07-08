package Constante;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        String materia1, materia2, materia3;
	        double nota1, nota2, nota3, promedio;

	        System.out.print("Ingrese la primera materia: ");
	        materia1 = sc.nextLine();

	        System.out.print("Ingrese la nota de " + materia1 + ": ");
	        nota1 = Double.parseDouble(sc.nextLine());

	        System.out.print("Ingrese la segunda materia: ");
	        materia2 = sc.nextLine();

	        System.out.print("Ingrese la nota de " + materia2 + ": ");
	        nota2 = Double.parseDouble(sc.nextLine());

	        System.out.print("Ingrese la tercera materia: ");
	        materia3 = sc.nextLine();

	        System.out.print("Ingrese la nota de " + materia3 + ": ");
	        nota3 = Double.parseDouble(sc.nextLine());

	        promedio = (nota1 + nota2 + nota3) / 3;

	        System.out.println("Promedio: " + promedio);

	        if (promedio >= 3.0) {
	            System.out.println("Resultado: Ganó");
	        } else {
	            System.out.println("Resultado: Perdió");
	        }

	        sc.close();
	}

}
	
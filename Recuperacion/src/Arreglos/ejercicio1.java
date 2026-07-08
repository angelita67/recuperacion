package Arreglos;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		
		
		 String estudiantes[] = new String[5];

	        
	        for (int i = 0; i < estudiantes.length; i++) {

	            estudiantes[i] = JOptionPane.showInputDialog(
	                    "Ingrese el nombre del estudiante " + (i + 1));
	        }

	        
	        String lista = "LISTA DE ESTUDIANTES\n\n";

	        for (int i = 0; i < estudiantes.length; i++) {

	            lista += (i + 1) + ". " + estudiantes[i] + "\n";
	        }

	        JOptionPane.showMessageDialog(null, lista);

	}

}

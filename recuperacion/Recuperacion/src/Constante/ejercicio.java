 package Constante;

import javax.swing.JOptionPane;

public class ejercicio {
	

	    String nombre;
	    double nota1, nota2, nota3,nota4, promedio;

	    public void iniciar() {

	        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
	        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota:"));
	        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota:"));
	        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota:"));
	        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuarta nota:"));
	     
	 
	  

	        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
	        
	      

	            if (promedio >= 3.5) {
	                JOptionPane.showMessageDialog(null,
	                	    "Nombre: " + nombre +
	    	                "\nNota 1: " + nota1 +
	    	                "\nNota 2: " + nota2 +
	    	                "\nNota 3: " + nota3 +
	    	                "\nNoya 4: " + nota4 +
	    	                "\nPromedio: " + promedio +
	                        "\nResultado: Ganó");
	            } else {
	                JOptionPane.showMessageDialog(null,
	                	    "Nombre: " + nombre +
	    	                "\nNota 1: " + nota1 +
	    	                "\nNota 2: " + nota2 +
	    	                "\nNota 3: " + nota3 +
	    	                "\nNoya 4: " + nota4 +
	    	                "\nPromedio: " + promedio +
	                        "\nResultado: Perdió");
	            }
	        }

	        

}



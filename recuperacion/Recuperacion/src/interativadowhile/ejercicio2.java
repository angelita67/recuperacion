package interativadowhile;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
	
		 int numero;
	        int secreto = 7;

	        do {

	            numero = Integer.parseInt(
	                    JOptionPane.showInputDialog("Adivine el número (1 al 10):"));

	            if (numero != secreto) {
	                JOptionPane.showMessageDialog(null, "Número incorrecto");
	            }

	        } while (numero != secreto);

	        JOptionPane.showMessageDialog(null, "¡Correcto! Adivinaste el número");

	}

}

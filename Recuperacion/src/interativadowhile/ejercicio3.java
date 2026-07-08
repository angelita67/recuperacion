package interativadowhile;

import javax.swing.JOptionPane;

public class ejercicio3 {
	public static void main(String[] args) {
		  String clave;

	        do {
	            clave = JOptionPane.showInputDialog("Ingrese la contraseña:");

	            if (!clave.equals("1234")) {
	                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
	            }

	        } while (!clave.equals("1234"));

	        JOptionPane.showMessageDialog(null, "Acceso permitido");
	}
}

package Variables;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	
	int numero1 , numero2, suma;
	public void iniciar() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
		numero2= Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
		
		suma = numero1 + numero2;
		
		JOptionPane.showConfirmDialog(null, " la suma  es:" + suma);
		
	}

}

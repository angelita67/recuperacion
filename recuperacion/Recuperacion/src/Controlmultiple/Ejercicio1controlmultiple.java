package Controlmultiple;
import javax.swing.JOptionPane;

public class Ejercicio1controlmultiple {

	public static void main(String[] args) {
		int opcion;

		        opcion = Integer.parseInt(JOptionPane.showInputDialog(
		                "Seleccione una fruta:\n"
		                + "1. Manzana\n"
		                + "2. Banano\n"
		                + "3. Naranja\n"
		                + "4. Uva"));

		        switch (opcion) {
		            case 1:
		                JOptionPane.showMessageDialog(null, "Escogió Manzana");
		                break;
		            case 2:
		                JOptionPane.showMessageDialog(null, "Escogió Banano");
		                break;
		            case 3:
		                JOptionPane.showMessageDialog(null, "Escogió Naranja");
		                break;
		            case 4:
		                JOptionPane.showMessageDialog(null, "Escogió Uva");
		                break;
		            default:
		                JOptionPane.showMessageDialog(null, "Opción inválida");
		        }
		    }
		

	}



package Controlmultiple;
import javax.swing.JOptionPane;

public class Ejercicio {

	public static void main(String[] args) {
		 int opcion;

	        opcion = Integer.parseInt(JOptionPane.showInputDialog(
	                "MENÚ DE BEBIDAS\n"
	                + "1. Agua - $2.000\n"
	                + "2. Gaseosa - $4.000\n"
	                + "3. Jugo - $5.000\n"
	                + "4. Café - $3.000\n\n"
	                + "Seleccione una opción:"));

	        switch (opcion) {
	            case 1:
	                JOptionPane.showMessageDialog(null,
	                        "Bebida: Agua\nPrecio: $2.000");
	                break;

	            case 2:
	                JOptionPane.showMessageDialog(null,
	                        "Bebida: Gaseosa\nPrecio: $4.000");
	                break;

	            case 3:
	                JOptionPane.showMessageDialog(null,
	                        "Bebida: Jugo\nPrecio: $5.000");
	                break;

	            case 4:
	                JOptionPane.showMessageDialog(null,
	                        "Bebida: Café\nPrecio: $3.000");
	                break;

	            default:
	                JOptionPane.showMessageDialog(null,
	                        "Opción no válida");
	        }
	     }
	}



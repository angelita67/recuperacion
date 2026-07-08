package interativadowhile;

import javax.swing.JOptionPane;

public class ejercicio1 {
	public static void main(String[] args) {
		   int opcion;
	        double saldo = 500000;
	        double retiro;

	        do {

	            opcion = Integer.parseInt(JOptionPane.showInputDialog(
	                    "CAJERO AUTOMÁTICO\n"
	                    + "1. Consultar saldo\n"
	                    + "2. Retirar dinero\n"
	                    + "3. Salir"));

	            switch (opcion) {

	                case 1:
	                    JOptionPane.showMessageDialog(null,
	                            "Su saldo es: $" + saldo);
	                    break;

	                case 2:
	                    retiro = Double.parseDouble(
	                            JOptionPane.showInputDialog(
	                            "Ingrese el valor a retirar:"));

	                    if (retiro <= saldo) {
	                        saldo = saldo - retiro;

	                        JOptionPane.showMessageDialog(null,
	                                "Retiro exitoso\n"
	                                + "Nuevo saldo: $" + saldo);
	                    } else {
	                        JOptionPane.showMessageDialog(null,
	                                "Saldo insuficiente");
	                    }
	                    break;

	                case 3:
	                    JOptionPane.showMessageDialog(null,
	                            "Gracias por usar el cajero");
	                    break;

	                default:
	                    JOptionPane.showMessageDialog(null,
	                            "Opción inválida");
	            }

	        } while (opcion != 3);
	}
	
}

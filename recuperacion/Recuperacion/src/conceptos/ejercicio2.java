package conceptos;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String producto1, producto2, producto3;
        int cantidad1, cantidad2, cantidad3;
        double precio1, precio2, precio3;
        double subtotal1, subtotal2, subtotal3, total;

        producto1 = JOptionPane.showInputDialog("Ingrese el primer producto:");
        cantidad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        precio1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

        producto2 = JOptionPane.showInputDialog("Ingrese el segundo producto:");
        cantidad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        precio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

        producto3 = JOptionPane.showInputDialog("Ingrese el tercer producto:");
        cantidad3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        precio3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

        subtotal1 = cantidad1 * precio1;
        subtotal2 = cantidad2 * precio2;
        subtotal3 = cantidad3 * precio3;

        total = subtotal1 + subtotal2 + subtotal3;

        JOptionPane.showMessageDialog(null,
                "******** FACTURA ********"
                + "\n" + producto1 + " = $" + subtotal1
                + "\n" + producto2 + " = $" + subtotal2
                + "\n" + producto3 + " = $" + subtotal3
                + "\n-------------------------"
                + "\nTOTAL A PAGAR: $" + total);
	}

}

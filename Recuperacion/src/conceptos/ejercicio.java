package conceptos;

import javax.swing.JOptionPane;

public class ejercicio {

	public void iniciar() {
	     String nombre;
	        String cargo;
	        double salario;
	        int horasExtras;
	        double valorHoraExtra;

	        nombre = JOptionPane.showInputDialog("Ingrese nombre del empleado:");
	        cargo = JOptionPane.showInputDialog("Ingrese cargo del empleado:");

	        salario = Double.parseDouble(
	                JOptionPane.showInputDialog("Ingrese salario:")
	        );

	        horasExtras = Integer.parseInt(
	                JOptionPane.showInputDialog("Ingrese horas extras trabajadas:")
	        );

	        valorHoraExtra = Double.parseDouble(
	                JOptionPane.showInputDialog("Ingrese valor de la hora extra:")
	        );

	        double pagoExtras = horasExtras * valorHoraExtra;
	        double salarioTotal = salario + pagoExtras;

	        JOptionPane.showMessageDialog(null,
	                "Empleado: " + nombre +
	                "\nCargo: " + cargo +
	                "\nSalario base: " + salario +
	                "\nHoras extras: " + horasExtras +
	                "\nPago horas extras: " + pagoExtras +
	                "\nSalario total: " + salarioTotal);
	}

}

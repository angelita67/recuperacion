package iterativaWhile;
import javax.swing.JOptionPane;
public class Ejercicio2 {

int contador = 1;
int numero;
int suma = 0;

public void iniciar() {
    proceso();
}

public void proceso() {

    while (contador <= 5) {

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        suma = suma + numero;
        contador++;
    }

    JOptionPane.showMessageDialog(null, "La suma es: " + suma);
}

}

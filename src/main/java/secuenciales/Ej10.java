package secuenciales;

import javax.swing.*;

public class Ej10 {
    public static void main(String[] args) {
        //Una empresa constructora se dedica a realizar bloques de pisos en
        // parcelas como las que figuran en la imagen de la derecha.
        // Necesitan saber el área de la parcela según las medidas A, B y C.

        //Declaración de variables

        double a, b, c, area;

        //Inicialización de variables

        a = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida A: "));

        b = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida B: "));

        c = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida C: "));

        //Cálculos

        area = a * b * c;

        //Mostrar resultados

        JOptionPane.showMessageDialog(null, "El área de la parcela es: " + area + " m2");


    }
}

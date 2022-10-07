package secuenciales;

import javax.swing.*;

public class Ej11 {
    public static void main(String[] args) {
        //Se requiere obtener el área de la figura, a partir de R y H.
        // Realiza un algoritmo para resolver el problema.
        //lo mostramos por JOptionPane
        //Declaración de variables

        double radio, altura, area;

        //Entrada de datos

        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la circunferencia: "));

        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura de la circunferencia: "));

        //Proceso

        area = Math.PI * Math.pow(radio, 2) * altura;

        //Salida

        JOptionPane.showMessageDialog(null, "El área de la figura es: " + area);


    }
}

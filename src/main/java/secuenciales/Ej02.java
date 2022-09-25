package secuenciales;

import javax.swing.*;

public class Ej02 {
    public static void main(String[] args) {

        //Algoritmo que lea por teclado el valor del radio de una circunferencia y
        // calcule la longitud, el área de la circunferencia y el volumen de una esfera con ese radio.

        double radio, longitud, area, volumen;

        //Entrada de datos

        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la circunferencia: "));

        //Proceso

        longitud = 2 * Math.PI * radio;

        area = Math.PI * Math.pow(radio, 2);

        volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        //Salida

        JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es: " + longitud + " el área es: " + area + " ; y el volumen de la esfera es: " + volumen);

    }
}

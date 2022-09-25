package secuenciales;

import javax.swing.*;

public class Ej06 {
    public static void main(String[] args) {
        //Tres personas deciden invertir su dinero para formar una empresa.
        // Cada una de ellas invierte una cantidad distinta,
        // que debes solicitar al usuario por teclado.
        // Implementa un algoritmo que imprima el porcentaje que invierte cada uno con respecto al total de la inversión.

        double persona1, persona2, persona3, total;

        //Entrada de datos

        persona1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad invertida por la primera persona: "));

        persona2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad invertida por la segunda persona: "));

        persona3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad invertida por la tercera persona: "));

        //Proceso

        total = persona1 + persona2 + persona3;

        //Salida

        JOptionPane.showMessageDialog(null, "El porcentaje invertido por la primera persona es: " + (persona1 * 100 / total) + "%");

        JOptionPane.showMessageDialog(null, "El porcentaje invertido por la segunda persona es: " + (persona2 * 100 / total) + "%");

        JOptionPane.showMessageDialog(null, "El porcentaje invertido por la tercera persona es: " + (persona3 * 100 / total) + "%");

        JOptionPane.showMessageDialog(null, "El total invertido es: " + total);


    }
}

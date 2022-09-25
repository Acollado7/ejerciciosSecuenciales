package secuenciales;

import javax.swing.*;

public class Ej03 {
    public static void main(String[] args) {
        //Algoritmo que lea tres notas numéricas de tipo float y calcule la nota media.

        float nota1, nota2, nota3, media;

        //Entrada de datos

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la primera nota: "));

        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la segunda nota: "));

        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la tercera nota: "));

        //Proceso

        media = (nota1 + nota2 + nota3) / 3;

        //Salida

        JOptionPane.showMessageDialog(null, "La nota media es: " + media);

    }
}

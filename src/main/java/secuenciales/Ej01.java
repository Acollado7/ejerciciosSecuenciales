package secuenciales;

import javax.swing.*;

public class Ej01 {
    //Algoritmo que lea por teclado una cantidad de grados centígrados y los pase a grados Fahrenheit.
    public static void main(String[] args) {

        double centigrados ,fahrenheit;

        //Creamos la entrada de datos

        centigrados = Double.parseDouble(JOptionPane.showInputDialog("Introduce los grados centígrados: "));

        //Proceso

        fahrenheit = (centigrados * 9/5) + 32;

        //Salida

        JOptionPane.showMessageDialog(null, centigrados + " grados centígrados son " + fahrenheit + " grados fahrenheit");

        //(20 °C × 9 / 5) + 32 = 68 °F

    }
}

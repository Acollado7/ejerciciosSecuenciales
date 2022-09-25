package secuenciales;

import javax.swing.*;

public class Ej07 {
    public static void main(String[] args) {
        //Realiza un conversor de dolares a euros.

        double euros, dolares;

        //Entrada de datos

        dolares = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de dolares: "));

        //Proceso

        euros = dolares * 0.97;

        //Salida

        JOptionPane.showMessageDialog(null, euros + " euros son " + dolares + " dólares");

        //ahora a la inversa, de euros a dolares

        euros = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de euros: "));

        dolares = euros * 1.03;

        JOptionPane.showMessageDialog(null, dolares + " dólares son " + euros + " euros");



    }
}

package secuenciales;

import javax.swing.*;

public class Ej09 {
    public static void main(String[] args) {
        //Programa que pida el precio de un artículo y calcule su valor aplicándole un 21% de IVA.

        double precio, iva;

        //Entrada de datos

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del artículo: "));

        //Proceso

        iva = precio * 0.21;

        //Salida

        JOptionPane.showMessageDialog(null, "El precio del artículo es: " + precio + "€");

        JOptionPane.showMessageDialog(null, "El IVA es: " + iva + "€");

        JOptionPane.showMessageDialog(null, "El precio final es: " + (precio + iva) + "€");


    }
}

package secuenciales;

import javax.swing.*;

public class Ej04 {
    public static void main(String[] args) {
        //Uber establece un precio mínimo por servicio de 1,25€ fijos y
        // además 8 céntimos por Km recorrido. Elabora un programa que lea el
        // número de km a recorrer y proporcione el presupuesto.

        double km, precio;

        //Entrada de datos

        km = Double.parseDouble(JOptionPane.showInputDialog("Introduce los km a recorrer: "));

        //Proceso

        precio = 1.25 + (km * 0.08);

        //Salida

        JOptionPane.showMessageDialog(null, "El precio del servicio es: " + precio);

    }
}

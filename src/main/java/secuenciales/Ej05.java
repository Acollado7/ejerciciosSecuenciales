package secuenciales;

import javax.swing.*;

public class Ej05 {
    public static void main(String[] args) {
        //Cada grupo de clase de un centro educativo tiene 30 horas de clase a la semana.
        // Calcula el número de profesores que se necesitan, teniendo en cuenta que un profesor imparte un
        // número de horas de clase a la semana, que se debe pedir al usuario,
        // junto con el número total de grupos que tiene el centro escolar.

        int horas, grupos, profesores;

        //Entrada de datos

        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas de clase a la semana: "));

        grupos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de grupos: "));

        //Proceso

        profesores = (horas * grupos) / 30;

        //Salida

        JOptionPane.showMessageDialog(null, "El número de profesores necesarios es: " + profesores);


    }
}

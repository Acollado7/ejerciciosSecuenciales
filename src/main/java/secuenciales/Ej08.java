package secuenciales;

import javax.swing.*;

public class Ej08 {
    public static void main(String[] args) {
        //En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología.
        // El presupuesto anual del hospital se reparte de la siguiente forma:
        // Ginecología 40%, Traumatología 30%, Pediatría 30%.
        // Obtener la cantidad de dinero que recibirá cada área, para cualquier cantidad de presupuesto.

        double presupuesto, ginecologia, traumatologia, pediatria;

        //Entrada de datos

        presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el presupuesto anual del hospital: "));

        //Proceso

        ginecologia = presupuesto * 0.4;

        traumatologia = presupuesto * 0.3;

        pediatria = presupuesto * 0.3;

        //Salida

        JOptionPane.showMessageDialog(null, "El presupuesto para Ginecología es: " + ginecologia);

        JOptionPane.showMessageDialog(null, "El presupuesto para Traumatología es: " + traumatologia);

        JOptionPane.showMessageDialog(null, "El presupuesto para Pediatría es: " + pediatria);


    }
}

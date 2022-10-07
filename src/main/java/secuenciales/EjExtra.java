package secuenciales;

import javax.swing.*;

public class EjExtra {
    public static void main(String[] args) {
        //Nos inventamos un ejercicio de algoritmo secuencial
        //Lo hacemos primero con JOptionPane y despues con Scanner
        //Mostramos el resultado con textBlock

        //Se nos pediran 5 palabras diferentes y
        // ademas saldra al lado de cada palabra los digitos que tiene.

        //Declaracion de variables

        String palabra1, palabra2, palabra3, palabra4, palabra5;
        int longitud1, longitud2, longitud3, longitud4, longitud5;

        //Entrada de datos

        palabra1 = JOptionPane.showInputDialog("Introduce la primera palabra: ");

        palabra2 = JOptionPane.showInputDialog("Introduce la segunda palabra: ");

        palabra3 = JOptionPane.showInputDialog("Introduce la tercera palabra: ");

        palabra4 = JOptionPane.showInputDialog("Introduce la cuarta palabra: ");

        palabra5 = JOptionPane.showInputDialog("Introduce la quinta palabra: ");

        //Proceso

        longitud1 = palabra1.length();

        longitud2 = palabra2.length();

        longitud3 = palabra3.length();

        longitud4 = palabra4.length();

        longitud5 = palabra5.length();

        //Salida

        JOptionPane.showMessageDialog(null, """
                Las palabras ordenadas por longitud son:
                %s (%d digitos)
                %s (%d digitos)
                %s (%d digitos)
                %s (%d digitos)
                %s (%d digitos)
                """.formatted(palabra1, longitud1, palabra2, longitud2, palabra3, longitud3, palabra4, longitud4, palabra5, longitud5));

        //ahora con Scanner

        //Declaracion de variables

        String palabra6, palabra7, palabra8, palabra9, palabra10;

        //Entrada de datos
       /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera palabra: ");

        palabra6 = sc.nextLine();

        System.out.println("Introduce la segunda palabra: ");

        palabra7 = sc.nextLine();

        System.out.println("Introduce la tercera palabra: ");

        palabra8 = sc.nextLine();

        System.out.println("Introduce la cuarta palabra: ");

        palabra9 = sc.nextLine();

        System.out.println("Introduce la quinta palabra: ");

        palabra10 = sc.nextLine();

        //Proceso

        int longitud6 = palabra6.length();

        int longitud7 = palabra7.length();

        int longitud8 = palabra8.length();

        int longitud9 = palabra9.length();

        int longitud10 = palabra10.length();

        //Salida

        System.out.println("""
                Las palabras ordenadas por longitud son:
                %s (%d digitos)
                %s (%d digitos)
                %s (%d digitos)
                %s (%d digitos)
                %s (%d digitos)
                """.formatted(palabra6, longitud6, palabra7, longitud7, palabra8, longitud8, palabra9, longitud9, palabra10, longitud10));
                */



    }
}

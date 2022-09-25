package secuenciales;

public class Ej11 {
    public static void main(String[] args) {
        //Se requiere obtener el área de la figura, a partir de R y H.
        // Realiza un algoritmo para resolver el problema.

        //Declaración de variables

        double r, h, area;

        //Inicialización de variables

        r = 10;

        h = 20;

        //Cálculos

        area = Math.PI * Math.pow(r, 2) * h;

        //Mostrar resultados

        System.out.println("El área de la figura es: " + Math.round(area) + " m2");


    }
}

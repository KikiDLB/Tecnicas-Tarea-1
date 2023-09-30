package Operaciones_Tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author kimberly
 */
public class Operaciones_Tarea1 {

    public static void main(String[] args) {
                int opcion;
//Estructura del menú
        do {
            String[] opciones = {
                "Suma",
                "Resta",
                "Multiplicación",
                "División",
                "Verificar si un número es primo",
                "Salir"
            };
//Permite escoger una opción o nos pide una opcion
            opcion = JOptionPane.showOptionDialog(
                null,
                "Selecciona la opción que desea:",
                "Tarea numero 1 - Kimberly López",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
// Se llama a la función correspondiente
            switch (opcion) {
                case 0:
                    realizarSuma();
                    break;
                case 1:
                    realizarResta();
                    break;
                case 2:
                    realizarMultiplicacion();
                    break;
                case 3:
                    realizarDivision();
                    break;
                case 4:
                    verificarPrimo();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa", "Tarea numero 1 - Kimberly López", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Eliga una opción válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 5);
    }
//Realiza la operaciónes de suma y da resultado
    private static void realizarSuma() {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número:"));
        double resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "La suma es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
//Realiza la operaciónes de restas y da resultado
    private static void realizarResta() {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número:"));
        double resultado = num1 - num2;
        JOptionPane.showMessageDialog(null, "La resta es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
//Realiza la operaciónes de multiplicación y da resultado
    private static void realizarMultiplicacion() {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número:"));
        double resultado = num1 * num2;
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
//Realiza la operaciónes de división y da resultado
    private static void realizarDivision() {
        double dividendo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dividendo:"));
        double divisor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el divisor:"));

        if (divisor != 0) {
            double resultado = dividendo / divisor;
            JOptionPane.showMessageDialog(null, "La división es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
//Validamos que un numero sea primo o no y da resultado
    private static void verificarPrimo() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para verificar si es primo:"));

        boolean esPrimo = esPrimo(numero);

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
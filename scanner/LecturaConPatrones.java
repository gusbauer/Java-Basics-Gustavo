/*
8. Lectura con patrones
Crea un programa que lea un texto e identifique si contiene una dirección de correo electrónico
usando findInLine() con un patrón regular.
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class LecturaConPatrones {
    public static void main(String[] args) {

        String texto = "Por favor, contacte a support@empresa.com para más detalles.";

        Pattern patron = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");

        Scanner scanner = new Scanner(texto);

        String correo = scanner.findInLine(patron);

        if (correo != null) {
            System.out.println("Se encontró una dirección de correo electrónico en el texto.");
            System.out.println("Correo encontrado: " + correo);
        } else {
            System.out.println("No se encontró ninguna dirección de correo electrónico.");
        }

        scanner.close();
    }
}

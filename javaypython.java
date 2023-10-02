import java.util.Scanner;

public class javaypython {

    public static void main(String[] args) {
        // Declarar e inicializar el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Solicitar la cadena de texto al usuario
        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();

        // Comprobar si la cadena de texto contiene la palabra "Java"
        if (cadena.contains("Java")) {
            // Comprobar si la cadena de texto contiene la palabra "Python"
            if (!cadena.contains("Python")) {
                // La cadena de texto contiene la palabra "Java" y no c-ontiene la palabra "Python"
                System.out.println("La cadena de texto contiene la palabra 'Java' y no contiene la palabra 'Python'.");
            } else {
                // La cadena de texto contiene la palabra "Java" pero también contiene la palabra "Python"
                System.out.println("La cadena de texto contiene la palabra 'Java' pero también contiene la palabra 'Python'.");
            }
        } else {
            // La cadena de texto no contiene la palabra "Java"
            System.out.println("La cadena de texto no contiene la palabra 'Java'.");
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}


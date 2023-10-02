import java.util.Scanner;

public class contieneAoB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ingresar texto
        System.out.println("Ingrese la cadena de texto: ");
        String cadena = sc.nextLine();

        // la cadena contiene la letra "a"
        boolean contieneA = cadena.contains("a");

        // la cadena contiene la letra "b"
        boolean contieneB = cadena.contains("b");

        // Vericacion de si la cadena contiene las letras "a" y "b"
        if (contieneA && contieneB) {
            System.out.println("La cadena contiene las letras 'a' y 'b'");
        } else {
            System.out.println("La cadena no contiene las letras 'a' y 'b'");
        }
    }
}

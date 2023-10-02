import java.util.Scanner;

public class divisbleentre2y3 {

    public static void main(String[] args) {
        // Declarar e inicializar el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        // Comprobar si el número es divisible por 2
        if (numero % 2 == 0) {
            System.out.println("El número es divisible por 2.");
        } else {
            System.out.println("El número no es divisible por 2.");
        }

        // Comprobar si el número es divisible por 3
        int sumaDigitos = 0;
        for (int i = 0; i < String.valueOf(numero).length(); i++) {
            sumaDigitos += Integer.parseInt(String.valueOf(numero).charAt(i) + "");
        }

        if (sumaDigitos % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else {
            System.out.println("El número no es divisible por 3.");
        }
        sc.close();
    }
}

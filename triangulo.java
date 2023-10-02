import java.util.Scanner;

    public class triangulo {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Solicitar los tres lados del triángulo
            System.out.println("Ingrese el lado a: ");
            float a = sc.nextFloat();
            System.out.println("Ingrese el lado b: ");
            float b = sc.nextFloat();
            System.out.println("Ingrese el lado c: ");
            float c = sc.nextFloat();

            // El triángulo es equilátero
            if (a == b && b == c) {
                System.out.println("El triángulo es equilátero");
            } else {
                // El triángulo es isósceles
                if (a == b || b == c || c == a) {
                    System.out.println("El triángulo es isósceles");
                } else {
                    // El triángulo es escaleno
                    System.out.println("El triángulo es escaleno");
                }
            }
        }
    }



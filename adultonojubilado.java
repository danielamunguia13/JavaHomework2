import java.util.Scanner;

public class adultonojubilado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos la edad de la persona
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        // Solicitamos si la persona está jubilada
        System.out.println("¿La persona está jubilada? (si/no): ");
        String esjubilado = sc.nextLine().toLowerCase();

        boolean jubilado = esjubilado.equals("si");

        // Verificamos si la persona es adulta y no está jubilada
        if (edad >= 18 && !jubilado) {
            System.out.println("La persona es adulta y no es jubilada");
        } else {
            System.out.println("La persona está jubilada o no es adulta");
        }
    }
}


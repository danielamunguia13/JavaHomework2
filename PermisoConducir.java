import java.util.Scanner;

public class PermisoConducir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la edad de la persona
        System.out.println("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();
        sc.nextLine();

        boolean tieneEdad = edad >= 18;

        // Solicitar si la persona tiene un permiso de conducir
        System.out.println("¿La persona tiene un permiso de conducir? (si/no): ");
        String permisoConducir = sc.nextLine().toLowerCase();

        boolean tienePermiso = permisoConducir.equals("si");

        // Imprimimos
        if (tieneEdad && tienePermiso) {
            System.out.println("Tiene la edad y el permiso.");
        } else {
            System.out.println("No cuenta con la edad o el permiso.");
        }
    }
}


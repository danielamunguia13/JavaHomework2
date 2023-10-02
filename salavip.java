import java.util.Scanner;

public class salavip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la edad
        System.out.println("Ingrese la edad del invitado: ");
        int edad = sc.nextInt();
        sc.nextLine();

        // Solicitar si tiene una invitación
        System.out.println("¿Cuenta con una invitación VIP? (si/no): ");
        String Invitacion = sc.nextLine().toLowerCase();

        boolean tieneInvitacion = Invitacion.equals("si");

        // Verificamos si la persona tiene acceso a la sala VIP
        if (edad >= 18 || tieneInvitacion) {
            System.out.println("Tiene acceso a la sala VIP");
        } else {
            System.out.println("No tiene acceso a la sala VIP");
        }
    }
}

import java.util.Scanner;

public class acceso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // solicitar el nombre de usuario
        System.out.println("Ingrese el nombre de usuario: ");
        String user = sc.nextLine();

        // ingresar contraseña
        System.out.println("Ingrese la contraseña: ");
        String password = sc.nextLine();

        // Verificacion del nombre de usuario y la contraseña
        if (user.equals("danielamunguia") && password.equals("daniela21")) {
            System.out.println("El usuario tiene acceso");
        } else {
            System.out.println("El usuario no tiene acceso");
        }
    }
}

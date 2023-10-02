import java.util.Scanner;

public class aprobado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar nota del estudiante
        System.out.println("Ingrese la nota del estudiante: ");
        int nota = sc.nextInt();

        // Verificacion de si el estudiante ha aprobado
        if (nota >= 60 && nota <= 100) {
            System.out.println("El estudiante ha aprobado");
        } else {
            System.out.println("El estudiante ha reprobado");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList Estudiantes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de 12 estudiantes");
        for (int i = 0; i < 12; i++) {
            System.out.print("Estudiante " + (i + 1) + "  ");
            Estudiantes.add(scan.nextLine());
        }

        for (int i = 0; i <= 2; i++) {
            System.out.println("Curso " + (i + 1));
            System.out.println(Estudiantes.subList(i * 4, (i * 4) + 4));
        }
    }
}

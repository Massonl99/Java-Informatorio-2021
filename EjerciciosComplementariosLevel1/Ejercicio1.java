import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Ingrese un Nombre");
        String NOMBRE = Scan.nextLine();
        System.out.printf("HOLA " + NOMBRE);
    }
}
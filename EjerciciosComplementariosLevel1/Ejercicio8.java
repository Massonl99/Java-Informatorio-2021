import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // declaracion de variables
        String NyA, Edad, Dirección, Ciudad;
        // inicio
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido");
        NyA = scan.nextLine();
        System.out.println("Ingrese su edad");
        Edad = scan.nextLine();
        System.out.println("Ingrese su direccion");
        Dirección = scan.nextLine();
        System.out.println("Ingrese su cuidad");
        Ciudad = scan.nextLine();

        System.out.println(Ciudad + " - " + Dirección + " - " + Edad + " - " + NyA);

    }
}

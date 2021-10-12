import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // declaracion de varibles
        char c;
        String palabra;
        // inicio
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minuscula");
        palabra = scan.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            int ascii = palabra.charAt(i);
            ascii = ascii - 32;
            c = (char) (ascii);
            System.out.print(c);
        }
    }
}

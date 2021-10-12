import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // declaracion de variables
        String frase, c;
        int res = 0;
        // inicio
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un Frase");
        frase = scan.nextLine();
        System.out.println("Ingrese un caracter");
        c = scan.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == c.charAt(0)) {
                res++;
            }
        }
        System.out.println(res);

    }
}

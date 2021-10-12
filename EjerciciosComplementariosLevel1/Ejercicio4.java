import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // declaracion de variables
        int num, res = 1;
        // inicio
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        System.out.println("El factorial de " + num + " es: " + res);
    }
}

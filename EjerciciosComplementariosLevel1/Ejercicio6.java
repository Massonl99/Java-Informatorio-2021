import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // declaracion de variables
        int num1, num2, res = 1;
        // inicio
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2 = scan.nextInt();
        for (int i = 1; i <= num2; i++) {
            res = res * num1;
        }
        System.out.println(num1 + " elevado a " + num2 + " = " + res);
    }
}

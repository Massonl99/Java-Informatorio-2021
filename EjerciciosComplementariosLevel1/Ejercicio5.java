import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // declaracion de variables
        int num1, num2, res = 0;
        // inicio
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2 = scan.nextInt();
        for (int i = 1; i <= num1; i++) {
            res = res + num2;
        }
        System.out.println(num1 + " x " + num2 + " = " + res);
    }
}

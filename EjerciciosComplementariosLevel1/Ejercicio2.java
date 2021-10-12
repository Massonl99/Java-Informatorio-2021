import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Declaracion de variables
        int num1, num2;
        // inicio
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2 = scan.nextInt();
        System.out.println("Resultasdos");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}

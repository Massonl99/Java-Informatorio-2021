import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = scan.nextInt();
        String resultado = "";
        for (int i = 1; i <= num; i++) {
            resultado = resultado + " " + i;
            System.out.println(resultado);
        }
    }

}
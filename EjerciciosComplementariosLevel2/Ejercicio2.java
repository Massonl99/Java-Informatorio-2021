import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList Numeros = new ArrayList<>();
        ArrayList Numeros2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese 5 Numeros enteros ");
        for (int i = 0; i < 5; i++) {
            Numeros.add(i, scan.nextInt());
        }

        System.out.println("Ingrese un numero entero para insertar al principio de la lista");
        Numeros2.add(0, scan.nextInt());
        for (int i = 1; i < 6; i++) {
            Numeros2.add(i);
        }

        System.out.println("Ingrese un numero entero para insertar al final de la lista");
        Numeros2.add(scan.nextInt());

        System.out.println("Listas 1 ");

        for (int i = 0; i < Numeros.size(); i++) {
            System.out.println(Numeros.get(i));
        }

        System.out.println("Largo de la lista 1 = " + Numeros.size());

        System.out.println("Listas 2 ");

        for (int i = 0; i < Numeros2.size(); i++) {
            System.out.println(Numeros2.get(i));
        }

        System.out.println("Largo de la lista 2 = " + Numeros2.size());
    }
}

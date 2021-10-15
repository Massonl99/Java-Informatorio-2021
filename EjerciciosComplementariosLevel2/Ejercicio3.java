import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList cartas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        cartas.add("A");
        for (int i = 1; i < 10; i++) {
            cartas.add(i, i + 1);
        }
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");

        System.out.println("Cartas en Orden");
        for (int e = 0; e < cartas.size(); e++) {
            System.out.print(cartas.get(e) + " ");
        }

        System.out.println("\nOrden invertido");
        for (int o = cartas.size() - 1; o >= 0; o--) {
            System.out.print(cartas.get(o) + " ");
        }

        Collections.shuffle(cartas);
        System.out.println("\nCartas Mezcladas");
        for (int u = 0; u < cartas.size(); u++) {
            System.out.print(cartas.get(u) + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList cuidades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String temp = "";
        int opc = 0;

        while (true) {
            System.out.println("Elija una Opcion: \n" + "1_ Ingresar una ciudad \n" + "2_ Salir");
            opc = scan.nextInt();
            if (opc == 1) {
                System.out.println("Ingrese una ciudad ");
                temp = scan.next();
                cuidades.add(temp);
            }
            if (opc == 2) {
                for (int i = 0; i < cuidades.size(); i++) {
                    System.out.println("#" + (i + 1) + " - " + cuidades.get(i));
                }
                break;
            }
            if (opc != 1 && opc != 2) {
                System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
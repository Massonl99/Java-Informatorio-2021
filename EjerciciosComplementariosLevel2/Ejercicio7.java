import java.util.ArrayList;

public class Ejercicio7 {

    public static void fizzBuzzFuncion(int num1, int num2) {
        ArrayList lista = new ArrayList<>();
        while (true) {
            if (num1 < num2) {
                for (int i = num1; i < num2; i++) {
                    if (i % 2 == 0 && i % 3 != 0) {
                        lista.add("Fizz");
                    } else if (i % 2 != 0 && i % 3 == 0) {
                        lista.add("Buzz");
                    } else if (i % 2 == 0 && i % 3 == 0) {
                        lista.add("FizzBuzz");
                    } else {
                        lista.add(i);
                    }
                }
            } else {
                System.out.println("Error al ingresar los datos");
            }
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i) + " ");
            }
        }
    }
}

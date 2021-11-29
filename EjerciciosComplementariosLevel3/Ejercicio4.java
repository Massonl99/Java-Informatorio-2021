package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Stream;

public class Ejercicio4 {
    public static void main(String[] args) {
        Stream<Integer> lista = crearLista().stream().distinct();
        lista.mapToInt(a -> factorial(a)).forEach(System.out::println);;
    }
    public static int factorial(int a) {
        int res = 1;
        for (int i=1 ; i<=a ; i++){
            res = res * i;
        }
        return res;
    }
    public static List<Integer> crearLista() {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        return palabras;
    }
}

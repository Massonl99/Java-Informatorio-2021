package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> lista = crearLista();
        lista.stream().mapToInt(a -> a*a).forEach(System.out::println);
    }
    public static List<Integer> crearLista() {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        return palabras;
    }
}

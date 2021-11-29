package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> lista = crearLista();
        List<Integer> listaFinal = lista.stream().map(a -> a= a*a).collect(Collectors.toList());
        System.out.println(listaFinal);
    }
    public static List<Integer> crearLista() {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        return palabras;
    }
}

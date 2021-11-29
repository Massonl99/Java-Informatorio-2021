package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> lista = crearLista();
        List<Integer> listaFinal = lista.stream()
                                        .distinct()
                                        .map(a -> a = factorial(a))
                                        .collect(Collectors.toList());
        System.out.println(listaFinal);
    }
    public static Integer factorial(int a) {
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

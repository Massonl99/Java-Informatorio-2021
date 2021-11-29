package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> lista = crearLista();
        long contador = lista.stream().filter(x -> x.startsWith("b") || x.startsWith("B")).count();
        System.out.println(contador);
    }
    public static List<String> crearLista() {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        return palabras;
    }
}

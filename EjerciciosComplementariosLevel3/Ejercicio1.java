package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> lista = crearLista();
        lista.stream().filter(x -> x != null && x != "").forEach(System.out::println);
    }
    public static List<String> crearLista() {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        return palabras;
    } 
}
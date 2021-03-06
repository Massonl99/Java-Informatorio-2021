package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> lista = crearLista();
        List<String> listaFinal =  lista.stream().filter(x -> x != null && x != "").collect(Collectors.toList());
        System.out.println(listaFinal);
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
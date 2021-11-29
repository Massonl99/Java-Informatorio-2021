package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        HashSet<Alumno> listAlumno = new HashSet<Alumno>();
        listAlumno.add(new Alumno("Lucas", "Masson", LocalDate.of(1999, 6, 4)));
        listAlumno.add(new Alumno("Marcos", "Masson", LocalDate.of(2001, 9, 6)));
        listAlumno.add(new Alumno("Mikaela", "Camera", LocalDate.of(2003, 9, 1)));
        listAlumno.add(new Alumno("Roberto", "Gimenes", LocalDate.of(1999, 07, 18)));
        listAlumno.add(new Alumno("Cosme", "Fulanito", LocalDate.of(1989, 8, 4)));
        System.out.println(listEdades(listAlumno));
    }

    public static HashMap<String, Integer> listEdades(HashSet<Alumno> list) {
        HashMap<String, Integer> result= new HashMap<String, Integer>();
        list.stream()
                .forEach(alumno -> {result.put(alumno.getFullName(), alumno.getAge());});
        return result;
    }
}


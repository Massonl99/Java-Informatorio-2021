import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> diccionario = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(42599375, "Lucas Masson", 145, 400));
        empleados.add(new Empleado(28603351, "Cesar Masson", 140, 200));
        empleados.add(new Empleado(30197134, "Cecilia Monzon", 200, 250));
        empleados.add(new Empleado(43695856, "Marcos Masson", 300, 500));

        for (Empleado i : empleados) {
            int sueldo = i.getValorHora() * i.getHorasTrabajadas();
            diccionario.put(i.getDni(), sueldo);
            System.out.println("Empleado: " + i.getNombre() + " - DNI: " + i.getDni() + " - Sueldo: " + sueldo);
        }
    }

    static class Empleado {
        private int dni;
        private String nombre;
        private int horasTrabajadas;
        private int valorHora;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora) {
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }

        public int getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public int getValorHora() {
            return valorHora;
        }
    }
}

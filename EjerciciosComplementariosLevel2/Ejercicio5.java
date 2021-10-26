import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//[6, 7, 8, 4, 5]
//[350, 345, 550, 600, 320]

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> precioPorHora = new ArrayList<Integer>();
        ArrayList<Integer> dailyAmounts = new ArrayList<Integer>();
        Integer total = 0;
        ChargeHours(scan, hoursWorked);
        ChargePrices(scan, hoursPrices);
        dailyAmounts = CalculateDailyAmounts(horasTrabajadas, precioPorHora);
        total = CalculateTotal(dailyAmounts);
        System.out.println(dailyAmounts);
        System.out.println(String.format("Total Final: $ %d", total));

    }

    public static void ChargeHours(Scanner scanner, ArrayList<Integer> hoursWorked) {
        System.out.println("Ingrese las horas trabajadas cada día de la semana:");
        for (int i = 0; i < 7; i++) {
            hoursWorked.add(scanner.nextInt());
        }
    }

    public static void ChargePrices(Scanner scanner, ArrayList<Integer> hoursPrices) {
        System.out.println("Ingrese el precio de las horas trabajadas en la semana:");
        for (int i = 0; i < 7; i++) {
            hoursPrices.add(scanner.nextInt());
        }
    }

    public static ArrayList<Integer> CalculateDailyAmounts(ArrayList<Integer> hoursWorked,
            ArrayList<Integer> hoursPrices) {
        ArrayList<Integer> dailyAmounts = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            dailyAmounts.add(hoursWorked.get(i) * hoursPrices.get(i));
        }
        return dailyAmounts;
    }

    public static Integer CalculateTotal(ArrayList<Integer> montosDiarios) {
        Integer total = 0;
        for (Integer i : montosDiarios) {
            total += i;
        }
        return total;
    }
}
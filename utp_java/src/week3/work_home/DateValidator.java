package week3.work_home;

import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        int day, month, year;
        Scanner input = new Scanner(System.in);
        boolean isLeapYear = false;

        System.out.print("Ingrese el año: ");
        if (input.hasNextInt()){
            year = input.nextInt();
            if ((year < 0 || year > 2025)) {
                System.err.println("Año inválido");
                return;
            }
        } else {
            System.err.println("Año inválido");
            return;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            } else
                isLeapYear = true;
        }

        System.out.print("Ingrese el mes: ");
        if (input.hasNextInt()) {
            month = input.nextInt();
            if (month <= 0 || month > 12) {
                System.err.println("Mes inválido");
                return;
            }
        } else {
            System.err.println("Mes inválido");
            return;
        }

        System.out.print("Ingrese el día: ");
        if (input.hasNextInt()) {
            day = input.nextInt();
            if (day <= 0 || day > 31){
                System.err.println("Día inválido.");
                return;
            }

            if ((day == 31) && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
                System.err.println("Día inválido.");
                return;
            }

            if (month == 2) {
                if (day == 29 && !isLeapYear) {
                    System.err.println("Día inválido.");
                    return;
                }
            }
        }

        System.out.println("Es una fecha válida!");
    }
}

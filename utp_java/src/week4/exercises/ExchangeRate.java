package week4.exercises;

import java.util.Scanner;


public class ExchangeRate {
    public static void main(String[] args) {
        final double rateUsd = 3.82;
        final double rateEur = 4.17;
        double amount, amountPen, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Moneda origen (USD - PEN - EUR): ");
        String currencyFrom = input.nextLine().toUpperCase();

        System.out.print("Moneda destino (USD - PEN - EUR): ");
        String currencyTo = input.nextLine().toUpperCase();

        System.out.print("Monto a convertir: ");
        amount = input.nextDouble();

        amountPen = switch (currencyFrom) {
            case "USD" -> amount * rateUsd;
            case "EUR" -> amount * rateEur;
            case "PEN" -> amount;
            default -> 0.0;
        };

        result = switch (currencyTo) {
            case "USD" -> amountPen / rateUsd;
            case "EUR" -> amountPen / rateEur;
            case "PEN" -> amountPen;
            default -> 0.0;
        };

        System.out.printf("El resultado es: %.2f", result);
    }
}

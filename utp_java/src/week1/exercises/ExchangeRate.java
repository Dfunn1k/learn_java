package week1.exercises;

import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 3.72;
        double pen, usd;
        System.out.print("Enter currency (USD): ");
        Scanner reader = new Scanner(System.in);

        if (!reader.hasNextDouble()) {
            System.err.print("Invalid input. Please enter number");
            return;
        }

        usd = reader.nextDouble();
        pen = usd * EXCHANGE_RATE;
        System.out.print("Currency (PEN): " + pen);
        reader.close();
    }
}

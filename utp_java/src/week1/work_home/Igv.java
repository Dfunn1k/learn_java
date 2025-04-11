package week1.work_home;

import java.util.Scanner;

public class Igv {
    public static void main(String[] args) {
        double subtotal;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter subtotal amount: ");
        if (!reader.hasNextDouble()) {
            System.err.println("Please enter a positive number");
            return;
        }
        subtotal = reader.nextDouble();
        System.out.println("IGV: " + subtotal * 0.18 );
        System.out.println("Subtotal:  "+ subtotal);
        System.out.println("Total:  "+ subtotal * 1.18);
    }
}

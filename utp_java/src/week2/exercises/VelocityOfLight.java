package week2.exercises;

import java.util.Scanner;

public class VelocityOfLight {
    public static void main(String[] args) {
        final int VOF = 299792458;
        long distance;
        int days;
        System.out.print("Ingrese el número de días: ");
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
            System.err.print("Ingrese un número válido");
            return;
        }

        days = input.nextInt();
        distance = (long) days * VOF;
        System.out.printf("La distancia que recorrera la luz en %d días es: %d m.", days, distance);
    }
}

package week3.exercises;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int n1, n2, n3;
        boolean isProgression;
        Scanner input = new Scanner(System.in);

        System.out.print("n1: ");
        n1 = input.nextInt();

        System.out.print("n2: ");
        n2 = input.nextInt();

        System.out.print("n3: ");
        n3 = input.nextInt();

        isProgression = ((n1 + n3) / 2) == n2;

        if (!isProgression)
            System.out.println("Los números no estan en P.A");

        System.out.printf("Los numéros: %d, %d, %d estan en P.A", n1, n2, n3);


    }
}

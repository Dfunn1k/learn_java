package week2.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeDigits {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        int sum = 0, number, last_digit;
        boolean has_3_digits;

        System.out.print("Ingrese un número entero de 3 dígitos: ");
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
            System.err.print("Número inválido");
            return;
        }

        number = input.nextInt();
        while (number % 10 != 0){
            last_digit = number % 10;
            digits.add(last_digit);
            sum += last_digit;
            number /= 10;
        }
        has_3_digits = digits.size() == 3;
        if (has_3_digits){
            System.out.printf("La suma de: %d + %d + %d = %d",
                    digits.get(2),
                    digits.get(1),
                    digits.get(0),
                    sum
            );
        } else {
            System.out.printf("El número tiene %d digitos", digits.size());
        }

    }
}

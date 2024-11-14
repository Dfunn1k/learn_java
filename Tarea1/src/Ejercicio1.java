import java.util.Scanner;

public class Ejercicio1 {
    static String calulatedPrimeNumbers(int num) {
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0)
                return "No es primo";
        }
        return "Primo";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();

        System.out.println(calulatedPrimeNumbers(num));
    }
}

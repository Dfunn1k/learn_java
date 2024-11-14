import java.util.Scanner;

public class Ejercicio4 {

    static int factorial(int num) {
        if (num != 0)
            return num * factorial(num - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();
        int count = num;

        while (count > 1) {
            num *= count - 1;
            count--;
        }
        
        System.out.println(num);
        // System.out.println(factorial(5));
    }
}

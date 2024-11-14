import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    static ArrayList<Integer> calculateOddNumbers(int num) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i < num; i += 2)
            oddNumbers.add(i);

        return oddNumbers;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();
        ArrayList<Integer> result = calculateOddNumbers(num);

        // for (int i = 0; i < result.size(); i++)
        //     System.out.println(result.get(i));

        for (int number : result)
            System.out.println(number);
    }
}

package poo;

public class exercise {
    public static int squareSum(int[] numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number * number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int test = squareSum(new int[] {1, 2, 2});
        System.out.println(test);
    }
}

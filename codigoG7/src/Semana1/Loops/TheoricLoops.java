package Semana1.Loops;

public class TheoricLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0)
                continue;
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el consumo en litros: ");
        float consumption = input.nextFloat();
        double pay;
        if (consumption <= 50)
            pay = 10;
        else if (consumption <= 200)
            pay = ((consumption - 50) * 0.5) + 10;
        else
            pay = ((consumption - 200) * 1.5) + ((consumption - 50) * 0.5) + 10;
        System.out.println(pay);
    }
}

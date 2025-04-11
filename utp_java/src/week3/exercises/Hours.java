package week3.exercises;

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        int hours, minutes, seconds;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese las horas(0 - 23): ");
        hours = input.nextInt();

        System.out.print("Ingrese los minutos(0 - 59): ");
        minutes = input.nextInt();

        System.out.print("Ingrese los segundos(0 - 59): ");
        seconds = input.nextInt();

        if (seconds == 59) {
            if (minutes == 59) {
                hours++;
                minutes = 0;
                seconds = 0;
            }
            minutes++;
            seconds = 0;
        }
        seconds++;
        System.out.printf("Siguiente hora -> %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

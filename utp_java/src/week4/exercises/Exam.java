package week4.exercises;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        String description;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la puntuación: ");
        description = switch (input.nextInt()) {
            case 0, 1, 2, 3, 4 -> "Descartado";
            case 5 -> "En suspenso";
            case 6 -> "Aceptable";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> throw new IllegalStateException("Valor inesperado: " + input.nextInt());
        };

        System.out.println("Su estado es: " + description);

    }
}

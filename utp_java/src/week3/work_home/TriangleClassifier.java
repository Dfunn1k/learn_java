package week3.work_home;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TriangleClassifier {
    public static void main(String[] args) {
        float side1, side2, side3;
        Set<Float> box = new HashSet<>();
        int box_size;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el lado 1 del triángulo: ");
        side1 = input.nextFloat();
        box.add(side1);

        System.out.print("Ingresa el lado 2 del triángulo: ");
        side2 = input.nextFloat();
        box.add(side2);

        System.out.print("Ingresa el lado 3 del triángulo: ");
        side3 = input.nextFloat();
        box.add(side3);

        if (!((side1 + side2) > side3 && ((side1 - side2) < side3))){
            System.err.println("\nTriángulo inválido...");
            return;
        }

        box_size = box.size();

        if (box_size == 1)
            System.out.println("\nEs un triángulo equilátero!");
        else if (box_size == 2)
            System.out.println("\nEs un triángulo isósceles");
        else
            System.out.println("\nEs un triángulo escaleno");


    }
}

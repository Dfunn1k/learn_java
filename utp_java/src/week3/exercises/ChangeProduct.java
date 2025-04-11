package week3.exercises;

import java.util.Scanner;

public class ChangeProduct {
    public static void main(String[] args) {
        float priceProduct;
        int numberDay;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        priceProduct = input.nextFloat();

        System.out.print("Ingrese el día en el que adquirió el producto: ");
        numberDay = input.nextInt();

        if (priceProduct < 80 && priceProduct > 50 && numberDay == 1)
            System.out.println("\nUsted puede devolver el producto :)");
        else if (priceProduct > 120 && numberDay != 3 && numberDay != 4)
            System.out.println("\nUsted puede devolver el producto :)");
        else
            System.out.println("\nUsted no puede devolver el producto :(");
    }
}

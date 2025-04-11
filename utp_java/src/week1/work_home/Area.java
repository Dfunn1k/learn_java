package week1.work_home;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        final float PI = 3.14F; // Math.PI
        float radius, area;

        System.out.print("Enter radius: ");
        Scanner reader = new Scanner(System.in);

        if (!reader.hasNextFloat()){
            System.err.print("Invalid input. Please enter a number");
            return;
        }

        radius = reader.nextFloat();
        area = (float) (PI * (Math.pow(radius, 2)));
        System.out.print("Area: " + area + " u²");
        reader.close();
    }
}

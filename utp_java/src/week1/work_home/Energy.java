package week1.work_home;


import javax.swing.*;
import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        final float GRAVITY = 9.81F;
        float energy, height, mass, velocity;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the height: ");
        if (!reader.hasNextFloat()){
            System.err.print("Invalid input. Please enter a number");
            return;
        }
        height = reader.nextFloat();

        System.out.print("Enter the mass: ");
        if (!reader.hasNextFloat()){
            System.err.print("Invalid input. Please enter a number");
            return;
        }
        mass = reader.nextFloat();

        System.out.print("Enter the velocity: ");
        if (!reader.hasNextFloat()){
            System.err.print("Invalid input. Please enter a number");
            return;
        }
        velocity = reader.nextFloat();

        energy = (float) (0.5 * mass * velocity * velocity) + (mass * GRAVITY * height);
        System.out.print("Total Mechanic Energy: " + energy + " J");
        reader.close();
    }
}

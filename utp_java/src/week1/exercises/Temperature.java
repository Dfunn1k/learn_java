package week1.exercises;


import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        System.out.print("Enter the temperature in °C: ");
        Scanner reader = new Scanner(System.in);

        if (!reader.hasNextFloat()) {
            System.err.print("Invalid input. Please enter number.");
            return;
        }

        celsius = reader.nextFloat();
        fahrenheit = (celsius * ((float) 9 / 5)) + 32;
        System.out.print("Fahrenheit -> " + " " + fahrenheit);
        reader.close();
    }
}

package week3.exercises;

import java.util.Scanner;

public class AgeProblem {
    public static void main(String[] args) {
        String gender;
        int age;
        boolean canRetirementMale, canRetirementFemale;

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su género(M o F): ");
        gender = input.nextLine().toUpperCase();

        System.out.print("Ingrese su edad: ");
        age = input.nextInt();

        if (age >= 60) {
            if (gender.equals("F"))
                System.out.println("!Usted puede jubilarse!");
            else if ((gender.equals("M")) && (age >= 65))
                System.out.println("!Usted puede jubilarse!");
        } else
            System.out.println("Usted no puede jubilarse aún");
    }
}

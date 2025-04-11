package week3.exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        final float salaryHealth = 15000, salaryEducation = 12000, salaryTransport = 18000;
        float result;
        char gender, sector;
        Scanner input = new Scanner(System.in);

        System.out.println("######################");
        System.out.println("CALCULADORA DE AUMENTO");
        System.out.print("1. Ingrese su género (F/M): ");
        gender = input.nextLine().toUpperCase().charAt(0);

        if (gender != 'F' && gender != 'M'){
            System.err.println("Género inválido, vuelvalo a intentar.");
            return;
        }

        System.out.println("2. Ingrese el sector para el que trabaja");
        System.out.print("(S-Salud / E-Educación / T-Transporte): ");
        sector = input.nextLine().toUpperCase().charAt(0);

        if (sector != 'S' && sector != 'E' && sector != 'T'){
            System.err.println("Sector inválido, vuelvalo a intentar.");
            return;
        }
        System.out.println("######################");
        switch (sector) {
            case 'S':
                if (gender == 'F')
                    System.out.println("Tu salario despues del aumento será: S/." + salaryHealth * 1.20f);
                else
                    System.out.println("Tu salario despues del aumento será: S/." + salaryHealth * 1.25f);
                break;
            case 'E':
                if (gender == 'F')
                    System.out.println("Tu salario despues del aumento será: S/." + salaryEducation * 1.12f);
                else
                    System.out.println("Tu salario despues del aumento será: S/." + salaryEducation * 1.11f);
                break;
            case 'T':
                if (gender == 'F')
                    System.out.println("Tu salario despues del aumento será: S/." + salaryTransport * 1.20f);
                else
                    System.out.println("Tu salario despues del aumento será: S/." + salaryEducation * 1.15f);
                break;
        }
    }
}

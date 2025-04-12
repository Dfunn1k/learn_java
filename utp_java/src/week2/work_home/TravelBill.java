package week2.work_home;

import java.util.Date;
import java.util.Scanner;

public class TravelBill {
    public static void main(String[] args) {
        Date date = new Date();
        String customerName, customerLastName, dni, nameFormat;
        int destiny;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese sus nombres: ");
        customerName = input.nextLine().toUpperCase();

        System.out.print("Ingrese sus apellidos: ");
        customerLastName = input.nextLine().toUpperCase();
        // TODO: falta reescribir
        System.out.println(customerName.indexOf(" "));
        System.out.println(customerName.substring(5));
        nameFormat = String.format("%s %s", customerName.substring(customerName.indexOf(" ")), customerLastName);
        System.out.print("Ingrese su DNI: ");
        dni = input.nextLine();

        System.out.println("Ingrese el destino(1/2/3)");
        System.out.print("(1.Chincha / 2.Cajamarca / 3.Arequipa): ");
        destiny = input.nextLine().toUpperCase().charAt(0);


        System.out.println("##############################");
        System.out.println("         TURISMO CIVA         ");
        System.out.println("##############################");
        System.out.printf("CLI: %s\n", customerName);
        System.out.printf("DNI: %s\n", dni);
        System.out.printf("FECHA Y HORA: %tD %tT", date, date);
    }
}

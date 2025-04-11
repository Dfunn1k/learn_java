package week2.exercises;

import java.util.Scanner;

public class Bill {
    static double id = Math.random() * 100;

    public static void main(String[] args) {
        String client, product1, product2;
        float price1, price2, subtotal1, subtotal2, total;
        int qty1, qty2, width_1, width_2;
        boolean has_discount_5;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        client = input.nextLine().toUpperCase();

        System.out.print("Producto 1 - nombre: ");
        product1 = input.nextLine().toUpperCase();
        System.out.print("Producto 1 - precio: ");
        price1 = input.nextFloat();
        System.out.print("Producto 1 - cantidad: ");
        qty1 = input.nextInt();

        input.nextLine();
        System.out.print("Producto 2 - nombre: ");
        product2 = input.nextLine().toUpperCase();
        System.out.print("Producto 2 - precio: ");
        price2 = input.nextFloat();
        System.out.print("Producto 2 - cantidad: ");
        qty2 = input.nextInt();

        has_discount_5 = client.equals("ANA");
        width_1 = 26 - (product1.length() + 4);
        width_2 = 26 - (product2.length() + 4);
        subtotal1 = price1 * qty1;
        subtotal2 = price2 * qty2;

        if (product1.contains("GAMER"))
            subtotal1 *= 0.98f;
        if (product2.contains("GAMER"))
            subtotal2 *= 0.98f;

        total = subtotal1 + subtotal2;

        if (has_discount_5) {
            total *= 0.95f;
        }
        // TODO: Hacer que los precios se alinien a la derecha
        // TODO: Hacer que se muestra la fecha dinámicamente
        System.out.println("###########################");
        System.out.println("         TIENDA ABC        ");
        System.out.println("###########################");
        System.out.printf("ID: %s\n", String.format("%010d", Bill.id));
        System.out.println("         COMPRAS           ");
        System.out.println("     AV. SAENZ PEÑA 376    ");
        System.out.println("         CHICLAYO          ");
        System.out.println("     LOTE: B   TERM: 5268  ");
        System.out.println("###########################");
        System.out.print("FECHA: \n");
        System.out.printf("VEND: JUAN  CLI: %S\n", client);
        System.out.println("###########################");
        System.out.printf("%d %s (%.2f)\n", qty1, product1, subtotal1);
        System.out.printf("%d %s (%.2f)\n\n", qty2, product2, subtotal2);
        System.out.printf("PAGO TOTAL: S/. %.2f\n", total);
        System.out.println("###########################");
        System.out.println("VUELVA PRONTO!");
        System.out.println("###########################");
        Bill.id++;
    }
}

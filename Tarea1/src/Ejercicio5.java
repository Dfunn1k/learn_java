import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        String message = "¡Felicidades! ¡Haz adivinado el número! El número es " + randomNumber;
        int attempts = 0;

        while (true){
            attempts++;
            System.out.print("Ingrese un número: ");
            int number = input.nextInt();

            if (number < randomNumber)
                System.out.println("Número demasiado bajo, intenta nuevamente");
            else if (number > randomNumber)
                System.out.println("Número demasiado alto, intenta nuevamente");
            else{
                System.out.println(message + " y lo adivinaste en " + attempts + " intento(s)");
                break;
            }
        }

    }
}

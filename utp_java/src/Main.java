import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age;
        System.out.print("Input your age: ");
        Scanner reader = new Scanner(System.in);

        if (reader.hasNextByte()) {
            age = reader.nextByte();
            reader.nextLine();
            System.out.println("Usted tiene " + age + " años");
        }
    }
}

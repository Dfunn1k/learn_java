import poo.Person;

public class Main {
    public static void main(String[] args) {
        Person dany = new Person("Dany", "Chavez", 22);
        System.out.println(dany.sayHi());
        dany.setName("Fiorella");
        System.out.println(dany.sayHi());
    }
}

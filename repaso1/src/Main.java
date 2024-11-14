import poo.Person;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dany", "Chavez", 23);
        Person person2 = new Person("Andrea", "Chavez", 19);
        Person person3 = new Person("Ivanna", "Chavez", 8);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person: people){
            int age = person.getAge();
            if (age > 12)
                System.out.println(person.getName());
        }



    }
}
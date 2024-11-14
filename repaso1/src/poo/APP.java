package poo;

public class APP {
    public static void main(String[] args) {
        Person person1 = new Person("Paul",  "La torre", 25);
        Student student1 = new Student("Dany", "Chavez", 23, 18);

        person1.showInfo();
        System.out.println("************");
        student1.showInfo();


    }
}

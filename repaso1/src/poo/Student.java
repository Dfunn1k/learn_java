package poo;

public class Student extends Person {
    private double average;

    public Student(String name, String lastName, int age, double average) {
        super(name, lastName, age);
        this.average = average;
    }

    @Override
    public void showInfo() {
        System.out.println("Mi nombre es: " + name);
        System.out.println("Mi apellido es: " + lastName);
        System.out.println("Mi edad es: " + age);
        System.out.println("Mi promedio es: " + average);
    }
}

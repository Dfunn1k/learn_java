package poo;


public class Teacher extends Person {
    private double salary;

    public Teacher(String name, String lastName, int age, double salary){
        super(name, lastName, age);
        this.salary = salary;
    }

}

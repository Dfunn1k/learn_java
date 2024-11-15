package poo;

public class Person {
    protected String name;
    protected String lastName;
    protected int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Mi nombre es: " + name);
        System.out.println("Mi apellido es: " + lastName);
        System.out.println("Mi edad es: " + age);
    }
}

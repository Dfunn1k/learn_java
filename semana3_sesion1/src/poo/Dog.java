package poo;

public class Dog {
    private String breed;
    private String color;
    private int age;

    public Dog() {}

    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("El valor debe ser <= 0");
        this.age = age;
    }

    void barking() {
    }

    void hungry() {
    }

    void sleeping() {
    }
}

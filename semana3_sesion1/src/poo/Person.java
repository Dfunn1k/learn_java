package poo;

public class Person {
    private String name;
    public String lastName;
    public int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // podemos definir un constructor que no requiera argumentos para inicializar
    public Person(){}

    // podemos crear otro constructor que solo inicialice un atributo
    public Person(String name){
        this.name = name;
    }

    // métodos getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHi(){
        return "Hello, my name is " + this.name + "!";
    }
}

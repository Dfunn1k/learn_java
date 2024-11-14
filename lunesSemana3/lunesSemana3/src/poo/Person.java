package poo;

public class Person {
    private String name; // default
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    // metodos

    public void sayHi() {
        System.out.println("Hola a todos");
    }

    public void sayHiToSomeone(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // crear un metodo para que una persona
    // diga hola en aleman

    // metodos getter y setter
    // getter: sirve para poder obtener el valor del atributo

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }

    // metodos setter

    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Valor incorrecto. Debe de ser mayor o igual a cero");
        }
    }
}

/* class User {
    ----
    ----
    ----

    // metodos

    login (username, password) {
        // codigo para el login

        ===> respuesta (token)
    }
    logout (username) {
        // codigo necesario para hacer logout
    }
    update (username, newPassword, password) ==> nuevo usuario
}


// crear un constructor sin argumentos
// crear un constructor con todos los argumentos
// crear un constructor solo para los atributos breed y color

 */


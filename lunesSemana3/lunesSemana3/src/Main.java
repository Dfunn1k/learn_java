import herencia.Persona;
import herencia.Estudiante;
import herencia.Profesor;


public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Dany", "Chavez");
        Persona persona2 = new Estudiante("Andrea", "Chavez", 20);
        Persona persona3 = new Profesor("Miguel", "Grillo", 1200);

        persona1.decirHola();
        persona2.decirHola();
        persona3.decirHola();
    }
}
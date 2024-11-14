package herencia;


import com.sun.source.tree.ArrayAccessTree;
import ejercicio6.Book;
import ejercicio6.Dvd;
import ejercicio6.LibraryItem;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("George", "Maxi", 13);
        // estudiante.decirHola();
        Persona persona = new Persona("Fiorela", "Salazar");

        Persona persona1 = new Estudiante("Jose",
                "Morales",
                13);

        Persona persona2 = new Profesor("Juan",
                "Cervantes",
                4000);

        persona1.decirHola();
        persona2.decirHola();

        System.out.println(persona1.getNombre());
        ArrayList<Integer> arrayList =  new ArrayList<>();

    }
}

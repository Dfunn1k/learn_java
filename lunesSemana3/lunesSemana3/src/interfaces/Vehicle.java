package interfaces;

public interface Vehicle {
    String color = "Azul"; // Este atributo es public, static y final

    void acelerar(); // Este metodo por defecto es abstracto
    void frenar();

    // Si queremos agregar implementación usamos 'default'
    default void printColor() {
        System.out.println(color);
    }
}

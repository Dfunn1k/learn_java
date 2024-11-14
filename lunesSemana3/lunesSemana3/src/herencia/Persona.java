package herencia;

public class Persona {
    protected String nombre;
    protected String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void decirHola() {
        String message = String.format("Hola a todos mi nombre es %s %s y soy una %s", nombre, apellido, getClass().getSimpleName());
        System.out.println(message);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

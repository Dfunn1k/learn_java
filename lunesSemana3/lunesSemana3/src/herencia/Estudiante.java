package herencia;


public class Estudiante extends Persona {
    private float promedio;

    public Estudiante(String nombre, String apellido, float promedio) {
        super(nombre, apellido);
        this.promedio = promedio;
    }

    @Override
    public void decirHola() {
        String message = String.format("¡Hola a todos! mi nombre es %s %s y soy un %s", nombre, apellido, getClass().getSimpleName());
        System.out.println(message);
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}

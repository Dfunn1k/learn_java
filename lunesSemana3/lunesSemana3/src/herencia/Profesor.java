package herencia;


public class Profesor extends Persona {
    private float salario;

    public Profesor(String nombre, String apellido, float salario) {
        super(nombre, apellido);
        this.salario = salario;
    }

    @Override
    public void decirHola() {
        String message = String.format("¡Hola a todos! mi nombre es %s %s y soy un %s", nombre, apellido, getClass().getSimpleName());
        System.out.println(message);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

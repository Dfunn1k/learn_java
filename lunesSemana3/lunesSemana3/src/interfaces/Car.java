package interfaces;

public class Car implements Vehicle{
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando");
    }
}

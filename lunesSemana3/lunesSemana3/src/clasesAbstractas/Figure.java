package clasesAbstractas;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract float area();
}

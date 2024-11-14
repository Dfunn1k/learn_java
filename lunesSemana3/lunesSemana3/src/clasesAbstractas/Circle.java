package clasesAbstractas;

public class Circle extends Figure {
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) Math.PI * (radius * radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if (radius < 0)
            System.out.println("The radius must be integer!");
        else
            this.radius = radius;
    }
}

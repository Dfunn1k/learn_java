package clasesAbstractas;

public class Square extends Figure {
    private float side;

    public Square(String color, float side) {
        super(color);
        this.side = side;
    }

    @Override
    public float area() {
        return side * side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        if (side < 0)
            System.out.println("The side must be integer!");
        else
            this.side = side;
    }
}

package clasesAbstractas;

public class App {
    public static void main(String[] args) {
        Figure figura = new Square("Red", 4);
        System.out.println(figura.area());
    }
}

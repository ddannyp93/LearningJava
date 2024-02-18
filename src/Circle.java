public class Circle extends Shapes {
    private final int radius;

    public Circle(int x, int y, int radius) {

        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*(radius*radius);
    }
}

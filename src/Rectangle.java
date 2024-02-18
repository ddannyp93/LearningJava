public class Rectangle extends Shapes {
    private int width;
    private int breadth;

    public Rectangle(int x, int y, int width, int breadth) {
        super(x, y);
        this.width = width;
        this.breadth=breadth;
    }
    @Override
    public double area() {
        return width*breadth;
    }
}

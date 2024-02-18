public class Main {
    public static void main(String[] args) {

        Rectangle my_rectangle = new Rectangle(2,4,4,10);
        System.out.println("My rectangle is this big = " + my_rectangle.area() + " cm2" );

        Circle my_circle = new Circle(1,2,5);
        System.out.println("My circle is this big = " + my_circle.area() + " cm2" );


    }
}
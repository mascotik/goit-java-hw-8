import figures.CircleShape;
import figures.QuadShape;
import figures.TriangleShape;

public class Main {
    public static void main(String[] args) {
        QuadShape quad = new QuadShape(4);
        System.out.println(quad.getName());

        TriangleShape triangle = new TriangleShape(5,5);
        System.out.println(triangle.getName());

        CircleShape circleShape = new CircleShape(2);
        System.out.println(circleShape.calculateArea());
    }
}

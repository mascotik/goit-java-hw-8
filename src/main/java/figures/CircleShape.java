package figures;

import figures.abstracts.Shape;

public class CircleShape extends Shape {
    private int radius;

    public CircleShape(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

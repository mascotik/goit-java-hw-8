package figures;

import figures.abstracts.Shape;

public class QuadShape extends Shape {
    private int sizeSide;

    public QuadShape(int sizeSide) {
        super("Quad");
        setSizeSide(sizeSide);
    }

    public void setSizeSide(int sizeSide) {
        this.sizeSide = sizeSide;
    }

    public int getSizeSide() {
        return sizeSide;
    }

    @Override
    public double calculateArea() {
        return sizeSide*sizeSide;
    }
}

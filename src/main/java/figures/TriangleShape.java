package figures;

import figures.abstracts.Shape;

public class TriangleShape extends Shape {
    private int sideSize;
    private int heightSize;

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }

    public int getHeightSize() {
        return heightSize;
    }

    public void setHeightSize(int heightSize) {
        this.heightSize = heightSize;
    }

    public TriangleShape(int sideSize, int HeightSize) {
        super("Triangle");
        this.sideSize = sideSize;
        this.heightSize = HeightSize;
    }

    @Override
    public double calculateArea() {
        return ((double) sideSize*heightSize / 2);
    }
}

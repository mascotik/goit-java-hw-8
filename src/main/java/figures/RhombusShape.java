package figures;

import figures.abstracts.Shape;

public class RhombusShape extends Shape {
    private int sideSize;
    private int heightSize;

    public RhombusShape(int sideSize, int heightSize) {
        super("Rhombus");
        this.sideSize = sideSize;
        this.heightSize = heightSize;
    }

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

    @Override
    public double calculateArea() {
        return sideSize * heightSize;
    }
}

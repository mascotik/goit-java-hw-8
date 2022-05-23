package figures;

import figures.abstracts.Shape;

public class RectangleShape extends Shape {

    private int sideXSize;
    private int sideYSize;

    public int getSideXSize() {
        return sideXSize;
    }

    public void setSideXSize(int sideXSize) {
        this.sideXSize = sideXSize;
    }

    public int getSideYSize() {
        return sideYSize;
    }

    public void setSideYSize(int sideYSize) {
        this.sideYSize = sideYSize;
    }

    public RectangleShape(int sideXSize, int sideYSize) {
        super("Rectangle");
        setSideXSize(sideXSize);
        setSideYSize(sideYSize);
    }

    @Override
    public double calculateArea() {
        return getSideXSize() * getSideYSize();
    }

}

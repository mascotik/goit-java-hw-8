package figures.abstracts;

import interfaces.Bordered;

public abstract class Shape implements Bordered {
    private final String name;
    private String borderColor = "none";

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void setBorderColor(String color) {
        borderColor = color;
    }

    @Override
    public abstract double calculateArea();
}


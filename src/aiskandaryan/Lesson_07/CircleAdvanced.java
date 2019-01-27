package aiskandaryan.Lesson_07;

public class CircleAdvanced {
    double radius = 1.0;
    String color = "red";

    public CircleAdvanced() {}

    public CircleAdvanced(final double radius) {
        this.radius = radius;
    }

    public CircleAdvanced(final double radius, final String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color +"]";
    }
}

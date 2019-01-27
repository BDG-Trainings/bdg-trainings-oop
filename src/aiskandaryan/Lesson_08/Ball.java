package aiskandaryan.Lesson_08;

public class Ball {
    float radius = 1.0f;

    public Ball(final float radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(final float radius) {
        this.radius = radius;
    }


    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}

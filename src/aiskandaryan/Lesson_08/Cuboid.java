package aiskandaryan.Lesson_08;

public class Cuboid {
    //Make private
    float length = 1.0f;
    float width = 1.0f;
    float height = 1.0f;

    public Cuboid(final float length, final float width, final float height) {
        if (length > 0) {
            this.length = length;
        }
        if (width > 0) {
            this.width = width;
        }
        if (height > 0) {
            this.height = height;
        }
    }

    public float getLength() {
        return length;
    }

    public void setLength(final float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(final float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(final float height) {
        this.height = height;
    }

    public double getArea() {
        return 2 *length * width + 2 * length * height + 2 * width * height;
    }

    public double getPerimeter() {
        return 4 * length + 4 * width + 4 * height;
    }

    public double getVolume() {
        return length * width * height;
    }
}

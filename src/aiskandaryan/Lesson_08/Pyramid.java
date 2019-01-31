package aiskandaryan.Lesson_08;

public class Pyramid {
    //Make private
    float height = 1.0f;
    float baseSide = 1.0f;

    public Pyramid(final float height, final float baseSide) {
        if (height > 0) {
            this.height = height;
        }
        if (baseSide > 0) {
            this.baseSide = baseSide;
        }
    }

    public float getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(final float baseSide) {
        this.baseSide = baseSide;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(final float height) {
        this.height = height;
    }

    private double getBaseArea() {
        return Math.sqrt(3) * baseSide * baseSide / 4;
    }

    public double getVolume() {
        return height * getBaseArea() / 3;
    }
}

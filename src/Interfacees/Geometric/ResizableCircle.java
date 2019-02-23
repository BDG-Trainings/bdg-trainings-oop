package Interfacees.Geometric;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public Resizable resize(int percent) {
        radius = radius * percent / 100;
        return this;
    }

}

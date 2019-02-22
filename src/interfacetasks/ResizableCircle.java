package interfacetasks;

public abstract class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public double resize() {
        return radius*1.7;
    }
}

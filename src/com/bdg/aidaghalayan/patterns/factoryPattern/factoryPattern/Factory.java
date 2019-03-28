package com.bdg.aidaghalayan.patterns.factoryPattern.factoryPattern;

public class Factory {
    private String shape;

    public Factory(){
        this.shape=shape;
    }

    public Shape getShape(ShapeType type) {
        if (type==ShapeType.Circle) {
            return new Circle();
        }
        if (type==ShapeType.Rectangle) {
           return new Rectangle();
        }
        if (type==ShapeType.Square) {
            return new Square();
        }
        return null;
    }
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();

        Shape shape1= shapeFactory.getShape(ShapeType.Circle);
        shape1.area();
        Shape shape2= shapeFactory.getShape(ShapeType.Rectangle);
        Shape shape3= shapeFactory.getShape(ShapeType.Square);
        shape2.area();
        shape3.area();
    }
}
package com.bdg.osahakyan.designpattern.abstractfactorypattern;

import com.bdg.osahakyan.designpattern.factorypattern.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args){

        //Get a ShapeFactory, get an Object, call its drew method

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape shape1 = roundedShapeFactory.getShape("RoundedRectangle");
        shape1.draw();

        Shape shape2 = roundedShapeFactory.getShape("RoundedSquare");
        shape2.draw();

        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("Square");
        shape4.draw();

    }
}

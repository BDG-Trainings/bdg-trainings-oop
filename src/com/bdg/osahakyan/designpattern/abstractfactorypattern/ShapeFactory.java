package com.bdg.osahakyan.designpattern.abstractfactorypattern;


import com.bdg.osahakyan.designpattern.factorypattern.Rectangle;
import com.bdg.osahakyan.designpattern.factorypattern.Shape;
import com.bdg.osahakyan.designpattern.factorypattern.Square;

public class ShapeFactory extends AbstractFactory {


    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle")) return new Rectangle();
        if(shapeType.equalsIgnoreCase("Square")) return new Square();

        return null;
    }
}

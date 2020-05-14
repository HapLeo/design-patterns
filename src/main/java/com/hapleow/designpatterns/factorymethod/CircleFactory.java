package com.hapleow.designpatterns.factorymethod;

public class CircleFactory implements ShapeFactory{

    @Override
    public Shape getShape() {

        return new Circle();
    }
}

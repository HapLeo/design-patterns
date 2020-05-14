package com.hapleow.designpatterns.factorymethod;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a square.");
    }
}

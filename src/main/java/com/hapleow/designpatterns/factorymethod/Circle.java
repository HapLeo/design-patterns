package com.hapleow.designpatterns.factorymethod;

/**
 * 圆形
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a circle.");
    }
}

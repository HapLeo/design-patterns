package com.hapleow.designpatterns.factorymethod;

/**
 * 三角形
 */
public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a triangle.");
    }
}

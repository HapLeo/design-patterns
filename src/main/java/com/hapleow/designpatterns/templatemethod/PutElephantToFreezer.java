package com.hapleow.designpatterns.templatemethod;

/**
 * 大象放冰箱
 */
public class PutElephantToFreezer extends AbstractTemplate{

    @Override
    protected void openDoor() {
        System.out.println("open freezer door.");
    }

    @Override
    protected void putIn() {
        System.out.println("put elephant into freezer.");
    }

    @Override
    protected void closeDoor() {
        System.out.println("close freezer door.");
    }
}

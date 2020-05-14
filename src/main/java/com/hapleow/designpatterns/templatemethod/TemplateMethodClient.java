package com.hapleow.designpatterns.templatemethod;

public class TemplateMethodClient {

    public static void main(String[] args) {

        AbstractTemplate template = new PutElephantToFreezer();
        template.execute();

        template = new PutCokeToWave();
        template.execute();
    }
}

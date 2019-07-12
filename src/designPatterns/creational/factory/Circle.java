package designPatterns.creational.factory;

import java.io.Serializable;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is a circle");
    }

public class InnerClass implements Serializable {

}
}

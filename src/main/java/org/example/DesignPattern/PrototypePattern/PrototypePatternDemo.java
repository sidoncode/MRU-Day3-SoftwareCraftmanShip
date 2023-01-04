package org.example.DesignPattern.PrototypePattern;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape.getType());

        Shape cloneShape1 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + cloneShape1.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + cloneShape2.getType());

    }
}

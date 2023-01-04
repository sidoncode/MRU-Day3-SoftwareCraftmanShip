package org.example.DesignPattern.ProxyPattern;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("TestImage_10mb.jpg");

        //image will be loaded from disk //

        image.display();

        System.out.println("\n");
        //image will not be loaded from disk //

        image.display();

    }
}

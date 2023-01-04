package org.example.DesignPattern.PrototypePattern;


public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::Draw() method");
    }

}


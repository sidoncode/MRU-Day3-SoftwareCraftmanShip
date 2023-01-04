package org.example.DesignPattern.PrototypePattern;

public class Square extends Shape{

    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::Draw() method");
    }

}

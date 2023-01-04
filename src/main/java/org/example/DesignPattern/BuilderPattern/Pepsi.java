package org.example.DesignPattern.BuilderPattern;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.1f;
    }
}

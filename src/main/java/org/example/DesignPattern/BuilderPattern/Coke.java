package org.example.DesignPattern.BuilderPattern;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2.1f;
    }
}

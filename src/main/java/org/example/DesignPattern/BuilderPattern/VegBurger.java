package org.example.DesignPattern.BuilderPattern;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Buger";
    }

    @Override
    public float price() {
        return 2.55f;
    }
}

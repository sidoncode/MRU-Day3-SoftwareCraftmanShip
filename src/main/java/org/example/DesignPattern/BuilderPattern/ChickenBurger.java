package org.example.DesignPattern.BuilderPattern;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}

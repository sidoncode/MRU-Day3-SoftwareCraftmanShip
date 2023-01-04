package org.example.DesignPattern.BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");

        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal NonVeg = mealBuilder.prepareNonVegMeal();
        System.out.println("\n Non Veg Meal");
        NonVeg.showItems();
        System.out.println("Total Cost: " + NonVeg.getCost());
    }
}

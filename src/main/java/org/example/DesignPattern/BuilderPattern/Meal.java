package org.example.DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost =0.0f;

        for(Item item: itemList){
            cost+=item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item: itemList){
            System.out.println("Items: " + item.name());
            System.out.println("Packing: " + item.packing());
            System.out.println("price: " + item.price());
        }
    }
}

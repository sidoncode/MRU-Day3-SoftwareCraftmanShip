package org.example.DesignPattern.Singleton;

public class SingleObject {

    // creating an object of SingleObjcet - Class
    private static  SingleObject instance = new SingleObject();

    // make the constructor private so that - this class cannot be // instantiated //

    private SingleObject(){
        // Empty Constructor //
    }

    // Below are the methods
    public static SingleObject getInstance(){
        return instance;
    }

    public void ShowMessage(){
        System.out.println("Hello World");
    }
}

package org.example.DesignPattern.Singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        // illegal error //
        // Compile Time error: The constructor singleObject() is not visible
        //SingleObject singleObject = new SingleObject();

        // get the only object available //
        SingleObject singleObject1 = SingleObject.getInstance();

        singleObject1.ShowMessage();

    }
}

package org.example.DesignPattern.CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","",900);

        Employee headSales = new Employee("Michal","Sales",400);

        Employee clerk1 = new Employee("Robert","Marketing",200);

        Employee clerk2 = new Employee("Bob","Marketing",200);

        Employee clerk3 = new Employee("Shai","Marketing",100);
        Employee HeadMarketing = new Employee("A","HEAD-Marketing",870);

        CEO.add(headSales);
        HeadMarketing.add(clerk1);
        HeadMarketing.add(clerk2);
        HeadMarketing.add(clerk3);

        System.out.println(CEO);


    }
}

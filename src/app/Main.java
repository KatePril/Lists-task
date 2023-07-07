package app;

import app.utils.DataProvider;
import app.utils.ListOperator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
        executeTaskTwo();
        executeTaskThree();


    }

    private static void executeTaskOne() {
        System.out.println("----------Task 1----------");
        ArrayList<String> names = DataProvider.getNames();
        System.out.println("Initial list:");
        System.out.println(ListOperator.getList(names));
        ListOperator.sort(names);
        System.out.println("Sorted list:");
        System.out.println(ListOperator.getList(names));
    }

    private static void executeTaskTwo() {
        System.out.println("----------Task 2----------");
        ArrayList<String> products = DataProvider.getProducts();
        System.out.println("Initial list:");
        System.out.println(ListOperator.getList(products));
        System.out.println("List part:");
        System.out.println(ListOperator.getList(
                ListOperator.sliceList(products, 1, 3)
        ));
    }

    private static void executeTaskThree() {
        System.out.println("----------Task 3----------");
        LinkedList<String> fruits = DataProvider.getFruits();
        System.out.println("Initial list:");
        System.out.println(ListOperator.getList(fruits));
        ListOperator.addFirstElement(fruits, "plum");
        ListOperator.addLastElement(fruits, "mango");
        System.out.println("Edited list:");
        System.out.println(ListOperator.getList(fruits));
    }
}

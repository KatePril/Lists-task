package app.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class DataProvider {
    public static ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Robert");
        names.add("Lisa");
        names.add("David");
        names.add("Amanda");
        return names;
    }

    public static ArrayList<String> getProducts() {
        ArrayList<String> products = new ArrayList<>();
        products.add("orange");
        products.add("mango");
        products.add("banana");
        products.add("apple");
        products.add("kiwi");
        products.add("cherry");
        return products;
    }

    public static LinkedList<String> getFruits() {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("apple");
        fruits.add("lemon");
        return fruits;
    }
}

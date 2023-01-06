package org.example;

import java.util.*;

import static org.example.Calc.*;

public class Main {

    public static void main(String[] args) {
        reversList();

    }
    /**
    * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     */
    private static void reversList() {
        List<String> list = new LinkedList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("black");
        list.add("white");
        list.add("brown");
        System.out.println("Исходный список: " + list);

        for (int i = 0, j = list.size()-1; i < j; i++) {
            list.add(i, list.remove(j));
        }
        System.out.println("Перевернутый список: " + list);
    }
}











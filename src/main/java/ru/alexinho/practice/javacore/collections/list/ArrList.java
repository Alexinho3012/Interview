package ru.alexinho.practice.javacore.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("London");
        list.add("Moscow");
        list.add("Paris");

        System.out.println(list.get(2));
    }
}

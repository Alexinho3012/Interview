package ru.alexinho.practice.javacore.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put(null, null);

        System.out.println(map.size());
    }
}

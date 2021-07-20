package ru.alexinho.practice.javacore.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Character> original = new ArrayList<>();
        List<Character> reverse = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            original.add(str.charAt(i));
        }

        for (int i = str.length() - 1; i >= 0; i--){
            reverse.add(str.charAt(i));
        }
        System.out.println(original.equals(reverse));
    }
}

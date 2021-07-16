package ru.alexinho.practice.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

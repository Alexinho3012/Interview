package ru.alexinho.practice.javacore.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.isLetter;

public class NumberOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int charCount = 0;
        char temp;

        for (int i = 0; i < str.length(); i++){
            temp = str.charAt(i);

            if (isLetter(temp)){
                charCount++;
            }
        }
        System.out.println(charCount);
    }
}

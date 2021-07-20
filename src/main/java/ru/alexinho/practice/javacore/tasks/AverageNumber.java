package ru.alexinho.practice.javacore.tasks;

import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {
        int[] mass = {5, 7, 11, 122, -6};
        System.out.println(averageNumber(mass));

        System.out.println(averageNumberStream(mass));
    }

    static double averageNumber(int[] mass){
        double average = 0;
        for (int i = 0; i < mass.length; i++){
            average += mass[i];
        }
        return average/mass.length;
    }

    static double averageNumberStream(int[] mass){
        return Arrays.stream(mass).average().getAsDouble();
    }
}

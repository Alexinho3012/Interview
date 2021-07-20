package ru.alexinho.practice.javacore.tasks;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int[] mass = {5, 11, 55, 43, -9, 0, 0, -4, 23};
//        arraysSorting(mass);
//        arraysSortingStream(mass);
        sortingMinToMax(mass);
        sortingMaxToMin(mass);
    }

    public static void arraysSorting(int[] mass){
        Arrays.sort(mass);
        //minToMax
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        //maxToMin
        for (int i = mass.length - 1; i >= 0; i--){
            System.out.print(mass[i] + " ");
        }
    }
    public static void arraysSortingStream(int[] mass){
        //minToMaxax
        Arrays.stream(mass).sorted().forEach(str -> System.out.print(str + " "));
    }

    public static void sortingMinToMax(int[] mass){
        for (int i = 0; i < mass.length - 2; i++){
            for (int j = i + 1; j < mass.length - 1; j++){
                if (mass[j] < mass[i]){
                    int temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        for (int i = 0; i < mass.length - 1; i++){
            System.out.println(mass[i]);
        }
    }
    public static void sortingMaxToMin(int[] mass){
        for (int i = 0; i < mass.length - 2; i++){
            for (int j = i + 1; j < mass.length - 1; j++){
                if (mass[j] > mass[i]){
                    int temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        for (int i = 0; i < mass.length - 1; i++){
            System.out.println(mass[i]);
        }
    }
}

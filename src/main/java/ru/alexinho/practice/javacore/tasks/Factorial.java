package ru.alexinho.practice.javacore.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = 0;
        try {
            inputNumber = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            throw new NumberFormatException("Введен неправильный символ");
        }
        if (inputNumber < 0){
            System.out.println("Факториала отрицательного числа не существует");
        }
        else {
        BigInteger y = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= inputNumber; i++){
            y = y.multiply(BigInteger.valueOf(i));
        }
        System.out.println(y);
        }
    }
}

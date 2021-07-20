package ru.alexinho.practice.javacore;

import java.io.*;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        //IOException
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String password = reader.readLine();
            if (password.length() < 8){
                throw new IOException();
            }
        } catch (IOException e) {
            throw new IOException("Пароль не может содержать менее 8 символов" + e.getMessage());
        }

        //ArithmeticException
        try {
            int a = 30, b = 0;
            int c = a/b;  // нельзя делить на ноль
            System.out.println ("Result = " + c);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }

        //NullPointerException
        try {
            String a = null; // нулевое значение
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            e.printStackTrace();
        }

        //FileNotFoundException
        File file = new File("Liverpool.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Такого файла не существует " + e.getMessage());
        }finally {

        }
    }
}

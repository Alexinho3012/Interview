package ru.alexinho.practice.javacore.tasks;

import java.util.ArrayList;
import java.util.List;

public class RepeatSymbol {
    public static void main(String[] args) {
        String text = "aaaabbcccddyyyycccc";
        a2b2(text);
    }

    public static void a2b2(String text){
        String str[] = text.split("");
        List<String> result = new ArrayList<>();
        int count = 1;
        int i;
        for (i = 0; i < str.length - 1; i++){
            if (str[i].equals(str[i+1])){
                count++;
            }
            else{
                result.add(count + str[i]);
                count = 1;
            }
        }
        result.add(count + str[i]);
        result.stream().forEach(o -> System.out.println(o));
    }
}

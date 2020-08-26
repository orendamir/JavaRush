package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        //ArrayList<String> list  = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int max = 0;
        for (int y = 0; y < 5; y++) {
            if(strings.get(y).length()>max) max=strings.get(y).length();
        }
        for (int x = 0; x < 5; x++) {
            if (strings.get(x).length()==max){
                System.out.println(strings.get(x));
            }
        }
    }
}

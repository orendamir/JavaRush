package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stroki = new String[10];
        int[] chisla = new  int[10];
        for (int i = 0; i < 10; i++) {
            stroki[i] = reader.readLine();
            chisla[i]=stroki[i].length();

        }
        for (int i = 0; i < chisla.length; i++) {
            System.out.println(chisla[i]);
        }
    }

}

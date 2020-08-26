package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] list = new String[10];
        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();

        }
        for (int t = 9; t > -1; t--)
            System.out.println(list[t]);

    }
}
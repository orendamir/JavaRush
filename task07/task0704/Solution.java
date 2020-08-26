package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            String s =reader.readLine();
            list[i]= Integer.parseInt(s);
        }

        for (int y = 9; y > -1; y--) {
            System.out.println(list[y]);

        }
    }
}


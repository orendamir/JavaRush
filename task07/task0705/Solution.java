package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] first = new int[10];
        int[] second = new int[10];
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);

        }
        for (int i = 0; i < 10; i++) {
            first[i]=list[i];
        }
        for (int y = 0; y < 10 ; y++) {
            second[y] = list[y+10];


            }
        for (int i = 0; i < 10; i++) {
            System.out.println(second[i]);
        }
        }
    }


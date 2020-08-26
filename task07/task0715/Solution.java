package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        int r=1;
        for (int i = 0; i < 3; i++) {
            list.add(r, "именно");
            r=r+2;
        }
        for (int t = 0; t < list.size(); t++) {
            System.out.println(list.get(t));
        }
    }
}

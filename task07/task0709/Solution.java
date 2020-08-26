package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <5; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        for (int y = 0; y < 5; y++) {
            if (list.get(y).length()<min) min = list.get(y).length();


        }
        for (int q = 0; q < 5; q++) {
            if (list.get(q).length()==min) System.out.println(list.get(q));
        }
    }
}

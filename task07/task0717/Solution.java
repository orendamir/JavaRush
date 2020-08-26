package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());

        }

        ArrayList<String> result = doubleValues(list);

        for (int y = 0; y < list.size(); y++) {
            System.out.println(list.get(y));

        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int dl = list.size() * 2;

        for (int i = 0; i < dl;) {
            list.add(i+1, list.get(i));
            i=i+2;
        }
        return list;
    }
}

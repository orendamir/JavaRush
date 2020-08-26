package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> dlina = new ArrayList<Integer>();


        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
            dlina.add(list.get(i).length());
        }
        int
        indexMax = dlina.indexOf(Collections.max(dlina));
        int indexMin = dlina.indexOf(Collections.min(dlina));
        if (indexMax > indexMin)
            System.out.println(list.get(indexMin));
        else
            System.out.println(list.get(indexMax));
    }
}

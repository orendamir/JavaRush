package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int N = Integer.parseInt(s1);
        int M= Integer.parseInt(s2);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        for (int y = 0; y < M; y++) {
            list.add(list.get(0));
            list.remove(0);

        }
        for (int t = 0; t < list.size(); t++) {
            System.out.println(list.get(t));
        }
    }
}


package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list.add("ghb");
        list.add("54d");
        list.add("ddd");
        list.add("ee3");
        list.add("22");
        int n = list.size();
        System.out.println(n);
        for (int y = 0; y < 5; y++) {
            System.out.println(list.get(y));
        }
    }
}

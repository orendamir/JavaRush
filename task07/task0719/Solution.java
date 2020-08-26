package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Arrays.*;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));


        }
        //Collections.sort(list, Collections.reverseOrder());
        for (int t = list.size()-1; t >= 0; t--) {
            System.out.println(list.get(t));
        }

    }
}

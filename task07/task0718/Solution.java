package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                list.add(reader.readLine());

            }
            for (int r = 0 ; r < list.size()-1 ; r++) {


                if (list.get(r).length() < list.get(r+1).length()) continue;
                else {
                    System.out.println(r+1);
                    break;
                }
            }
        }
    }
}


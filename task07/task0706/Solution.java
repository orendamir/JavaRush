package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        for (int i = 0; i < list.length ; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);

        }
        int chet=0;
        int nechet=0;
        for (int i = 0; i < list.length; i++) {
            if(i%2==0) chet+=list[i];
            else nechet+=list[i];
        }
        if(chet>nechet) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }

}

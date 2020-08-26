package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] arr = getInts();
        ///ArrayList<Integer> list = getInts();
        Arrays.sort(arr);
        maximum = arr[19];
        minimum = arr[0];

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        int[] mass = new int[20];
        for(int i =0; i<mass.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            mass[i] = Integer.parseInt(reader.readLine());
        }
        return mass;

    }

}



package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int w = 0; w < 13; w++) {
            String bravo = list.get(4); //сохраняем последнюю строку массива в созданную переменную
            list.remove(4); // удаляем последнюю строку массива
            list.add(0, bravo);
        }
        for (int vv = 0; vv < 5; vv++) {
            System.out.println(list.get(vv));
        }


    }
}

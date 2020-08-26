package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> full = new ArrayList<Integer>();
        ArrayList<Integer> f1 = new ArrayList<Integer>();
        ArrayList<Integer> f2 = new ArrayList<Integer>();
        ArrayList<Integer> f3 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int s1= Integer.parseInt(s);

            full.add(s1);

        }
        for (int t = 0; t < 20; t++) {
            if ((full.get(t) % 2 == 0) & (full.get(t) % 3 == 0)) {
                f1.add(full.get(t));
                f2.add(full.get(t));

            }
            else if ((full.get(t) % 2 == 0)) f2.add(full.get(t));
            else if ((full.get(t) % 3 == 0)) f1.add(full.get(t));
            else f3.add(full.get(t));

        }
        //printList(full);
        printList(f1);
        printList(f2);
        printList(f3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int r = 0; r < list.size(); r++) {
            System.out.println(list.get(r));
        }
        //System.out.println(list);
    }
}

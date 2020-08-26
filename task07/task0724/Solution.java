package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human ded1    = new Human("Arnold", true, 65);
        Human ded2    = new Human("Askold", true, 70);
        Human bab1    = new Human("Zina", false, 45);
        Human bab2    = new Human("Irin", false, 89);
        Human otec = new Human("Petr", true, 30, ded1, bab1);
        Human mat = new Human("Roza", false, 29, ded2, bab2);
        Human son1 = new Human("Max", true, 5, otec, mat);
        Human daughter = new Human("Mia", false, 1, otec, mat);
        Human daughter2 = new Human("Leyla", false, 10, otec, mat);






        for (Human human : list ) System.out.println(human);
        // напишите тут ваш код
    }
    public static ArrayList<Human> list = new ArrayList<>();

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            list.add(Human.this);
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            list.add(Human.this);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
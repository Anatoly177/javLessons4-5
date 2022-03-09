package com.lesson5.tasks4;

public class Task2 {

     static class Solution {

         public static void main(String[] args) {
             Man man1 = new Man("Игорь", 20, "Москва");
             Man man2 = new Man("Николай", 32, "Владимир");

             Woman woman1 = new Woman("Елена", 21, "Киров");
             Woman woman2 = new Woman("Марина", 44, "Новосибирск");
             System.out.println(man1.toString());
             System.out.println(man2.toString());
             System.out.println(woman1.toString());
             System.out.println(woman2.toString());

         }
        public static class Man {
            String name;
            int age;
            String address;

            public Man(String name) {
                this.name = name;
            }

            public Man(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public Man(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }

            @Override
            public String toString() {
                return "[" +
                        name +
                        " " + age +
                        " " + address +
                        ']';
            }
        }

        public static class Woman {
            String name;
            int age;
            String address;

            public Woman(String name) {
                this.name = name;
            }

            public Woman(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public Woman(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }

            @Override
            public String toString() {
                return "[" +
                        name +
                        " " + age +
                        " " + address +
                        ']';
            }
        }
    }
}

package com.lesson5.tasks3;

public class Task2 {

    class Cat {
        String name;
        int weight;
        int age;
        String color;
        String address;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }

        public Cat(String name,int age) {
            this.name = name;
            this.weight = 4;
            this.age = age;
        }

        public Cat(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.name = null;
            this.address = null;
            this.age = 3;
        }

        public Cat(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
        }
    }
}

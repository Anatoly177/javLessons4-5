package com.lesson5.tasks2;

public class Task2 {

    class Cat {
        String name;
        int weight;
        int age;
        String color;
        String address;

        public void initialize(String name)
        {
            this.name = name;
        }

        public void initialize(String name, int weight, int age)
        {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }

        public void initialize(String name, int age)
        {
            this.name = name;
            this.weight = 15;
            this.age = age;
        }

        public void initialize(int weight, String color)
        {
            this.weight = weight;
            this.color = color;
            this.name = null;
            this.address = null;
            this.age = 4;
        }

        public void initialize(int weight, String color, String address)
        {
            this.weight = weight;
            this.color = color;
            this.address = address;
        }
    }
}

package com.lesson5.tasks2;

public class Task3 {

    class Dog {
        String name;
        int growth;
        String color;

        public void initialize(String name)
        {
            this.name = name;
        }

        public void initialize(String name, int growth)
        {
            this.name = name;
            this.growth = growth;
        }

        public void initialize(String name, int growth, String color)
        {
            this.name = name;
            this.growth = growth;
            this.color = color;
        }
    }
}

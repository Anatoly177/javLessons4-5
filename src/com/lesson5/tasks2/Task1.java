package com.lesson5.tasks2;

public class Task1 {

    class Friend {
        private String name;
        private int age;
        private String sex;

        public void initialize(String name)
        {
            this.name = name;
        }

        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public void initialize(String name, int age, String sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}

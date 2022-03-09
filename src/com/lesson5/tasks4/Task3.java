package com.lesson5.tasks4;

public class Task3 {

    public static void main(String[] args) {
        Cat tomCat = new Cat("Tom", 5, 15);
        Dog fatDog = new Dog("Fat", 7, 20);
    }

    public static class Dog {

        String name;
        int age;
        int weight;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Dog(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

    }

    public static class Cat {

        String name;
        int age;
        int weight;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

    }
}

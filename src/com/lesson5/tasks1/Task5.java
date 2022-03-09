package com.lesson5.tasks1;

public class Task5 {

    public static void main(String[] args) {
        Task2.Cat cat1 = new Task2.Cat();
        Task2.Cat cat2 = new Task2.Cat();
        Task2.Cat cat3 = new Task2.Cat();

        cat1.setStrength(2);
        cat2.setStrength(5);
        cat3.setStrength(4);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }
}

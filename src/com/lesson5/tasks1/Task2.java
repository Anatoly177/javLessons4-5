package com.lesson5.tasks1;

public class Task2 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.setStrength(1);
        cat2.setStrength(3);
        System.out.println(cat1.fight(cat2));

    }

    static class Cat {
        int strength;

        boolean fight(Cat cat) {
                return this.strength > cat.strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }
    }


}

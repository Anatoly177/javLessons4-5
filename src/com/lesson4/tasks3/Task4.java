package com.lesson4.tasks3;

public class Task4 {

    public static void main(String[] args) {

        square();

    }

    public static void square() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print("S");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}

package com.lesson4.tasks3;

public class Task5 {

    public static void main(String[] args) {
        multiply();
    }

    public static void multiply() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }

}

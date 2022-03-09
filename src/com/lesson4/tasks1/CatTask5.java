package com.lesson4.tasks1;

public class CatTask5 {
    public static int count = 0;
    public static void main(String[] args) {
        CatTask5 cat1 = new CatTask5();
        CatTask5.count++;
        CatTask5 cat2 = new CatTask5();
        CatTask5.count++;
        System.out.println("Cats count is " + CatTask5.count);
    }
}

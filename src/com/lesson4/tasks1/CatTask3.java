package com.lesson4.tasks1;

class CatTask3 {
    private static int catsCount = 0;
    public static void setCatsCount(int catsCount)
    {
        CatTask3.catsCount = catsCount;
    }

    public static void main(String[] args) {
        CatTask3.setCatsCount(4);
        System.out.println(catsCount);
    }
}
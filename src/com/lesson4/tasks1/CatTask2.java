package com.lesson4.tasks1;

class CatTask2
{
    private static int catsCount = 0;
    public static void addNewCat()
    {
        catsCount++;
    }

    public static void main(String[] args) {
        CatTask2 cat = new CatTask2();
        cat.addNewCat();
        System.out.println(catsCount);
        cat.addNewCat();
        System.out.println(catsCount);
    }
}

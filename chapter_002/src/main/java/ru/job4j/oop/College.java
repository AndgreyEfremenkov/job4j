package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman fresh = new Freshman();
        Student student = fresh;
        Object obj = fresh;

        System.out.println(fresh);
        System.out.println(student);
        System.out.println(obj);

    }
}

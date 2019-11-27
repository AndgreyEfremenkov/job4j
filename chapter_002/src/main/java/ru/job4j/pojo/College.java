package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Efremenkov Andrey Alecseevich");
        student.setGroup(1);
        student.setDate("26.09.2019");

        System.out.println(student.getFullName() + " Study in : " + student.getGroup() + " group, entered the " + student.getDate());

    }
}

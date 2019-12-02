package ru.job4j.tracker;

public class Tiger extends Predator {

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Tiger ");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Tiger tiger2 = new Tiger("tiger2");
        System.out.println(tiger.name);
        System.out.println(tiger2.name);

    }
}

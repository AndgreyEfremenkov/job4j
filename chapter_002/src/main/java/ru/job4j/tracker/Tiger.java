package ru.job4j.tracker;

import ru.job4j.models.Task;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger ");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}

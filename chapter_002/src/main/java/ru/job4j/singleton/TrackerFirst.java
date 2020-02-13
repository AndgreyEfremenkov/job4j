package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public enum TrackerFirst {

    INSTANCE;

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerFirst tracker = TrackerFirst.INSTANCE;
    }
}

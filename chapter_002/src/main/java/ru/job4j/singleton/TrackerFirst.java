package ru.job4j.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum TrackerFirst {

    INSTANCE;

    private final Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }

    public Item add(Item model) {
        return model;
    }
    
    public static void main(String[] args) {
        Tracker tracker = TrackerFirst.INSTANCE.getTracker();
    }
}

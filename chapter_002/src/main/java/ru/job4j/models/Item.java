package ru.job4j.models;

public class Item {
    public String name;

    public String description;

    public long create;

    public Item() {
        super();
        System.out.println("load item");
    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public static void main(String[] args) {
        Bug bug = new Bug();
    }
}


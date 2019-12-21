package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== All items ====");
        Item[] temp = Arrays.copyOf(tracker.findAll(), tracker.findAll().length);
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Name: " + temp[i].getName() + " ID: " + temp[i].getId());
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter old ID: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        tracker.replace(id,item);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter ID: ");
        tracker.delete(id);
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter ID: ");
        if (tracker.findById(id) != null) {
            Item temp = tracker.findById(id);
            System.out.println("Name: " + temp.getName() + " ID: " + temp.getId());
        } else System.out.println("Invalid ID ");
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] temp = Arrays.copyOf(tracker.findByName(name), tracker.findByName(name).length);
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Name: " + temp[i].getName() + " ID: " + temp[i].getId());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select:"));
            if (select == 0) {
               StartUI.createItem(input,tracker);
            } else if (select == 1) {
                StartUI.showAllItems(input,tracker);
            } else if (select == 2) {
                StartUI.editItem(input,tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input,tracker);
            } else if (select == 4) {
               StartUI.findItemById(input,tracker);
            } else if (select == 5) {
               StartUI.findItemsByName(input,tracker);
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("ERROR! command not found try again");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

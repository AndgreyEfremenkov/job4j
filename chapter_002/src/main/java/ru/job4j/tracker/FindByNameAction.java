package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items =  tracker.findByName(name);
        for (int i = 0; i < items.length; i++) {
            System.out.println("Name: " + items[i].getName() + " ID: " + items[i].getId());
        }
        return true;
    }
}

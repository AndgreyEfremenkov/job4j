package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter old ID: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        tracker.replace(id, item);
        return true;
    }
}

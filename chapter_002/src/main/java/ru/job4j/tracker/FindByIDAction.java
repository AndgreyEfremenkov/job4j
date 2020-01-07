package ru.job4j.tracker;

public class FindByIDAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        Item temp = tracker.findById(id);
        if (temp != null) { //проверил item на null
            System.out.println("Name: " + temp.getName() + " ID: " + temp.getId());
        } else {
            System.out.println("Invalid ID ");
        }
        return true;
    }
}


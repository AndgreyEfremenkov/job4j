package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(30);
        System.out.println("First = " + first.load + ". Second = " + second.load);
        first.exchange(second);
        System.out.println("First = " + first.load + ". Second = " + second.load);
    }
}

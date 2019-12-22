package ru.job4j.poly;

public class Bus implements Transport {

    private int passengers = 0;
    private double fuel = 0;
    private double money = 0;

    @Override
    public void ride() {
        this.fuel -= 5;
    }

    @Override
    public void passengers(int numPassengers) {
        this.passengers += numPassengers;
        this.money += (numPassengers * 25);
    }

    @Override
    public double fill(double fuel) {
        this.fuel += fuel;
        this.money -= (fuel * 10);
        return this.money;
    }
}

package ru.job4j.strategy;

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder sp = new StringBuilder();
        sp.append("  *  " + System.lineSeparator());
        sp.append(" * * " + System.lineSeparator());
        sp.append("*   *" + System.lineSeparator());
        sp.append("*****" + System.lineSeparator());
        return sp.toString();
    }
}

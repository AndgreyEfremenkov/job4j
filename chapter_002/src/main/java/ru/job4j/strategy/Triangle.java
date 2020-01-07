package ru.job4j.strategy;

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder sp = new StringBuilder();
        sp.append("  *  ");
        sp.append(" * * ");
        sp.append("*   *");
        sp.append("*****");
        return sp.toString();
    }
}

package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций + - * /
 * @author Efremenkov
 * @since 08.10.2019
 * @version 1
 */

public class Calculator {
    /**
     * Сложение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public static double add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
        return result;
    }

    public static double add(double first, double second, double third) {
        double result = add(first, add(second, third));
        System.out.println(first + "+" + second + "+" + third + "=" + result);
        return result;
    }

    /**
     * Деление.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    /**
     * Умножение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Вычитание.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */

    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        add(1, 1);
        add(1, 1, 3);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }

}



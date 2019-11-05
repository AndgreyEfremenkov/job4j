package ru.job4j.convert;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
        in = 3;
        expected = 180;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("3 dollar are 180. Test result : " + passed);
        in = 4;
        expected = 280;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("4 euro are 280. Test result : " + passed);
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        int ruble = dollarToRuble(3);
        System.out.println("3 dollar are " + ruble + " ruble.");
        ruble = euroToRuble(4);
        System.out.println("4 euro are " + ruble + " ruble.");
    }
}

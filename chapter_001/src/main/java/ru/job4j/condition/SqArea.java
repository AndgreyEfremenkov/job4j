package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * k + 2);
        System.out.println("Н=" + h);
        double l = h * k;
        System.out.println("L=" + l);
        double s = l * h;
        return s;
    }
    public static void main(String[] args) {
        double result1 = square(24, 3);
        System.out.println(" P = 24, k = 3, S = 27, real = " + result1);
        result1 = square(6, 2);
        System.out.println(" P = 6, k = 2, S = 2, real = " + result1);
    }
}

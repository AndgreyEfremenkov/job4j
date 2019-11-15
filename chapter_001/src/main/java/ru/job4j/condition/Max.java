package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }
    public static int max(int first, int second, int third) {
        boolean condition = first > second;
        int temp = condition ? first : second;
        condition = temp > third;
        int result = condition ? temp : third;
        return result;
    }
    public static int max(int first, int second, int third, int fourth) {
        boolean condition = first > second;
        int temp = condition ? first : second;
        condition = third > fourth;
        int temp2 = condition ? third : fourth;
        condition = temp > temp2;
        int result = condition ? temp : temp2;
        return result;
    }

}

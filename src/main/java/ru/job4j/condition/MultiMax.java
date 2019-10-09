package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second,int third){
        int condition=(first>second) ? first : second;
        int result =condition>third ? condition : third;
        return result;
    }
}

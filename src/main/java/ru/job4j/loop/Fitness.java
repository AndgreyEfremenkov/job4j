package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan,int nik){
        int mouth= 0;
        while (ivan<nik){
            ivan=ivan*3;
            nik=nik*2;
            mouth++;
        }

        return mouth;
    }
}

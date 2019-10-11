package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish){
        boolean prime= false;
        int flag=0;
        for (int i=1; i<=finish; i++)
            if ((finish%i)==0)  flag++;
            if (flag<=2) prime=true; //проверяет что-бы число могло делиться только на себя и еденицу.
        return prime;
    }
}

package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        boolean flag=true;
        for (int i=2; i <=finish; i++) {
            for (int j = 2; j<i; j++)
                if (i%j==0) flag = false;
             if (flag==true) count++;
            flag = true;
        }

        return count;
    }
}

package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public int player(int player) {
        if (player % 2 == 1) {
            return 1;
        } else {
            return 2;
        }

    }
    public static void main(String[] args) {
        Matches matches = new Matches();
        Scanner input = new Scanner(System.in);
        System.out.println(" На столе лежат 11 спичек." +
                "\n Два игрока по очереди берут от 1 до 3 спичек." +
                "\n Выигрывает тот, кто забрал последние спички.\n");
        int numOfMatches = 11;
        int player = 1;
        int takeMatches;
        while (numOfMatches != 0) {
            System.out.println("Осталось: " + numOfMatches + " спичек. Игрок " + matches.player(player) + " возьмите спички!");
            takeMatches = input.nextInt();
            if ( takeMatches <= numOfMatches && (takeMatches == 1 || takeMatches == 2 || takeMatches == 3) ) {
                numOfMatches -= takeMatches;
                player++;
            } else {
                System.out.println("Ой-ёй, кто-то не читает правила");
            }



        }
    }
}

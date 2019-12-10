package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ask;
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        ask = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0: System.out.println("Да.");
                    break;
            case 1: System.out.println("Нет.");
                    break;
            default : System.out.println("Может быть.");
                    break;
        }
    }
}
